import Vue from 'vue'
import Vuex from 'vuex'
import { Getters } from './getters.js'
import { Mutations } from './mutations.js'
import { Actions } from './actions.js'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    postTypeName: '공지',
  },
  mutations: Object.assign({}, Mutations),
  getters: Object.assign({}, Getters),
  actions: Object.assign({}, Actions),
})
