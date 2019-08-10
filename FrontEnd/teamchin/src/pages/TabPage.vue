<template>
    <v-layout column>

        <router-view></router-view>

        <v-layout  align-end class="overflow-x-hidden">
            <v-bottom-navigation app v-model="tab" color= "#9AD9D8">
                
                <v-btn @click="getTab('home')">
                    <span>Home</span>
                    <v-icon>home</v-icon>
                </v-btn>
                       
                <v-btn @click="getTab('todo')">
                    <span>Todo</span>
                    <v-icon>check</v-icon>
                </v-btn>
                <v-btn @click="getTab('chat')">
                    <span>Chat</span>
                    <v-icon>question_answer</v-icon>
                </v-btn>

                <v-btn @click="getTab('board')">
                    <span>Board</span>
                    <v-icon>library_books</v-icon>
                </v-btn>

                <v-btn @click="getTab('calendar')">
                    <span>Calendar</span>
                    <v-icon>calendar_today</v-icon>
                </v-btn>
                
            </v-bottom-navigation>
        </v-layout>
    </v-layout>
</template>


<script>
import router from '@/router/router'
import {store} from '@/store/store'

export default {
    name: 'tabPage',
    data () {
        return {
            tab: 0,
        }
    },
    methods: {
        getTab(tabName) {
            router.push('/'+store.getters.userInfo+'/'+store.getters.teamId+'/'+tabName);
        }
    },
}
</script>
