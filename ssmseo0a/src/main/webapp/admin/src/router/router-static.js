import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import qiantai from '@/views/modules/qiantai/list'
    import caiwurenyuan from '@/views/modules/caiwurenyuan/list'
    import kehutousu from '@/views/modules/kehutousu/list'
    import kehuhuifang from '@/views/modules/kehuhuifang/list'
    import fuwubiangeng from '@/views/modules/fuwubiangeng/list'
    import tousuchuli from '@/views/modules/tousuchuli/list'
    import fuwuxiangmu from '@/views/modules/fuwuxiangmu/list'
    import shouzhizhenghe from '@/views/modules/shouzhizhenghe/list'
    import feihetongshouzhi from '@/views/modules/feihetongshouzhi/list'
    import hetongshouzhi from '@/views/modules/hetongshouzhi/list'
    import qiandinghetong from '@/views/modules/qiandinghetong/list'
    import rijiegongzi from '@/views/modules/rijiegongzi/list'
    import kehu from '@/views/modules/kehu/list'
    import fuwurenyuan from '@/views/modules/fuwurenyuan/list'
    import yuejiegongzi from '@/views/modules/yuejiegongzi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/qiantai',
        name: '前台',
        component: qiantai
      }
          ,{
	path: '/caiwurenyuan',
        name: '财务人员',
        component: caiwurenyuan
      }
          ,{
	path: '/kehutousu',
        name: '客户投诉',
        component: kehutousu
      }
          ,{
	path: '/kehuhuifang',
        name: '客户回访',
        component: kehuhuifang
      }
          ,{
	path: '/fuwubiangeng',
        name: '服务变更',
        component: fuwubiangeng
      }
          ,{
	path: '/tousuchuli',
        name: '投诉处理',
        component: tousuchuli
      }
          ,{
	path: '/fuwuxiangmu',
        name: '服务项目',
        component: fuwuxiangmu
      }
          ,{
	path: '/shouzhizhenghe',
        name: '收支整合',
        component: shouzhizhenghe
      }
          ,{
	path: '/feihetongshouzhi',
        name: '非合同收支',
        component: feihetongshouzhi
      }
          ,{
	path: '/hetongshouzhi',
        name: '合同收支',
        component: hetongshouzhi
      }
          ,{
	path: '/qiandinghetong',
        name: '签订合同',
        component: qiandinghetong
      }
          ,{
	path: '/rijiegongzi',
        name: '日结工资',
        component: rijiegongzi
      }
          ,{
	path: '/kehu',
        name: '客户',
        component: kehu
      }
          ,{
	path: '/fuwurenyuan',
        name: '服务人员',
        component: fuwurenyuan
      }
          ,{
	path: '/yuejiegongzi',
        name: '月结工资',
        component: yuejiegongzi
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
