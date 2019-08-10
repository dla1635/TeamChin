<template>
  <v-container fluid>
    <v-app-bar app flat absolute scroll-target="#scrolling">
        <v-spacer></v-spacer>
        <v-layout offset-xs-1 font-weight-bold class="appbar_title"> 팀 목록</v-layout>
        <v-spacer></v-spacer>
        <v-btn icon @click="createTeam">
            <v-icon>add</v-icon>
        </v-btn>
        
    </v-app-bar>
    <v-sheet id="scrolling" class="overflow-y-auto" max-height="600">
        <v-list id="list">
            <v-list-item v-for="item in teams" :key="item.title" id="teamList">
                <v-list-item-content @click="enterTeam(item.t_id)">
                    <v-list-item-title v-text="item.name"></v-list-item-title>
                </v-list-item-content>
            </v-list-item>
        </v-list>
    </v-sheet>
  </v-container>
</template>


<script>

import {store} from '@/store/store'
import Router from '@/router/router'

export default {
    name: 'TeamSelectPage',
    data() {
        return{
            teams : []
        }
    },
    methods: {
        enterTeam(T_id) {
            Router.push(store.getters.userInfo+"/"+T_id+"/home")
        },
        createTeam() {
            Router.push("teamName")
        }
    },
    async mounted() {

        var payload = {
            userId : store.getters.userInfo
        }

        await store.dispatch('getTeamList',payload);
        this.teams = store.getters.teamList;
    } 
}
</script>

<style scoped>
#teamList {
    border : 2px solid #E4E0D7; 
    height:60px; 
    border-radius:10px; 
    margin:0 15px 15px 10px;
}

#scrolling {
    margin-top: 30px;
}

#list {
    margin-top: 30px;
}
.back_icon {
  color: #000000;
}

.appbar_title {
  justify-content: center;
}

.container {
  background-color: #ffffff;
}

.top_menu_container {
  margin: 10px 0px;
}

.outside_icon {
  margin: 0px 10px;
}
</style>
