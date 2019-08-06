<template>
<v-list>
    <v-list-item v-for="item in teams" :key="item.title" id="teamList" @click="">
        <v-list-item-content>
            <v-list-item-title v-text="item.name"></v-list-item-title>
        </v-list-item-content>
    </v-list-item>
</v-list>
     
</template>


<script>

import {store} from '@/store/store'

export default {
    name: 'TeamSelectPage',
    data() {
        return{
            teams : []
        }
    },
    methods: {
        
    },
    async mounted() {
        var payLoad = {
            userId : store.getters.userInfo
        }
        console.log(payLoad)

        await store.dispatch('getTeamList',payLoad);

        console.log(store.state.teamList);
        this.teams = store.state.teamList;
    } 
}
</script>

<style>
#teamList {
    border : 2px solid #E4E0D7; 
    height:60px; 
    border-radius:10px; 
    margin:0 15px 15px 10px;
}
</style>
