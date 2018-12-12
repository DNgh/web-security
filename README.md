# web-security
web应用采用spring security控制权限，架构springmvc+spring+hibernate

* 自定义类：
验证用户名和密码SystemUserDetailsService,验证是否有权限访问资源SystemAccessDecisionManager,加载资源权限映射SystemSecurityMetadataSource
* 自定义页面：
登录页面loginPage,访问拒绝页面403
* 验证流程：
SecurityContextPersistenceFilter-------->ConcurrentSessionFilter-------->WebAsyncManagerIntegrationFilter-------->HeaderWriterFilterr-------->CsrfFilter-------->LogoutFilter-------->UsernamePasswordAuthenticationFilter-------->RequestCacheAwareFilter-------->SecurityContextHolderAwareRequestFilter-------->AnonymousAuthenticationFilter-------->SessionManagementFilter-------->ExceptionTranslationFilter-------->FilterSecurityInterceptor
