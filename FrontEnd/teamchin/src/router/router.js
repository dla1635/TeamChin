import Vue from 'vue'
import Router from 'vue-router'
import TeamName from './teamName'
import TeamNickname from './teamNickname'
import selectTeam from './selectTeam'

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    TeamName,
    TeamNickname,
    selectTeam
  ]
})
