package com.example.springbootdemoprovide.user.config.shiro;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

/**
 * Shiro的配置类
 */
@Configuration
public class ShiroConfig {
    /**
     * 创建ShiroFilterFactoryBean
     */
      public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager){
          ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();

          //设置安全管理器
          shiroFilterFactoryBean.setSecurityManager(securityManager);

          return shiroFilterFactoryBean;
      }
    /**
     * 创建DefaultWebSecurityManager
     */
      @Bean(name = "securityManager")
      public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
          DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
          //关联Realm
          securityManager.setRealm(userRealm);
          return securityManager;
      }

    /**
     * 创建Realm
     */
    @Bean(name = "userRealm")
     public UserRealm getRealm(){
         return new UserRealm();
     }

    /**
     * 凭证匹配器
     * （由于我们的密码校验交给Shiro的SimpleAuthenticationInfo进行处理了
     * 所以我们需要修改下doGetAuthenticationInfo中的代码;
     * ）
     * 可以扩展凭证匹配器，实现 输入密码错误次数后锁定等功能，下一次
     */
//    @Bean(name = "credentialsMatcher")
//    public HashedCredentialsMatcher hashedCredentialsMatcher() {
//        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
//        //散列算法:这里使用MD5算法;
//        hashedCredentialsMatcher.setHashAlgorithmName("md5");
//        //散列的次数，比如散列两次，相当于 md5(md5(""));
//        hashedCredentialsMatcher.setHashIterations(2);
//        //storedCredentialsHexEncoded默认是true，此时用的是密码加密用的是Hex编码；false时用Base64编码
//        hashedCredentialsMatcher.setStoredCredentialsHexEncoded(true);
//        return hashedCredentialsMatcher;
//    }

    /**
     * Shiro生命周期处理器
     */
//    @Bean
//    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
//        return new LifecycleBeanPostProcessor();
//    }

    /**
     * 开启Shiro的注解(如@RequiresRoles,@RequiresPermissions),需借助SpringAOP扫描使用Shiro注解的类,并在必要时进行安全逻辑验证
     * 配置以下两个bean(DefaultAdvisorAutoProxyCreator(可选)和AuthorizationAttributeSourceAdvisor)即可实现此功能
     */
//    @Bean
//    @DependsOn({"lifecycleBeanPostProcessor"})
//    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator() {
//        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
//        advisorAutoProxyCreator.setProxyTargetClass(true);
//        return advisorAutoProxyCreator;
//    }




}
