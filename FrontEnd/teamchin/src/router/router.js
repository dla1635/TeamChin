import Vue from 'vue'
import Router from 'vue-router'
import TeamName from './teamName'
import TeamNickname from './teamNickname'

import PostRoutes from './post'
import PostDetailRoutes from './postDetail'
import PostNewRoutes from './postNew'
import BoardRoutes from './board'
import NoticeRoutes from './notice'


Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    TeamName,
    TeamNickname,
    PostRoutes,
    PostDetailRoutes,
    BoardRoutes,
    NoticeRoutes,
    PostNewRoutes,
  ]
})
