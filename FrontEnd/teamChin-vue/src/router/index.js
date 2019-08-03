import Vue from 'vue';
import Router from 'vue-router';
import BoardPage from '@/pages/BoardPage';
import BoardPreview from '@/components/BoardPreview';
import BoardDetail from '@/components/BoardDetail'

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: '/',
      name: 'BoardPage',
      component: BoardDetail,
    },
  ],
});
