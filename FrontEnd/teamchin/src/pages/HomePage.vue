<template>
    <v-flex>

            <!-- 홈 네비게이션 -->
        <v-app-bar v-if="loading" id="homeHeader" app flat>
            <v-toolbar-title>{{teamInfo[0].name}}</v-toolbar-title>
            <v-spacer></v-spacer>
            <v-btn icon>
                <v-icon>menu</v-icon>
            </v-btn>
            <v-btn icon>
                <v-icon>person</v-icon>
            </v-btn>
        </v-app-bar>
        <!-- top네비 -->
        <v-sheet style="margin:50px 0;height:100%;">
            
            

            <!-- 컨텐츠 -->
            <v-container>
                <h2>시간이 얼마 남지 않았어요</h2>
            </v-container>

            <!-- 가로 슬라이드 카드 -->
            <v-slide-group v-model="model">
                <v-slide-item v-for="n in 15" :key="n">
                    <v-card v-bind:color="setCardColor(n)" class="ma-2 pa-3" height="120" width="150">
                        <span id="card_title">논문해석</span><br>
                        <span id="card_date">7월5일(토)</span><br>
                        <span id="card_d_day">D-3</span>
                    </v-card>
                </v-slide-item>
            </v-slide-group>

            <v-container>
                <h2>그룹 멤버</h2>
            </v-container>

            <!-- 팀원 리스트 -->
            <v-list id="list" two-line>
                <v-list-item v-for="item in teamInfo" :key="item.title" id="teamList">
                    <v-list-item-avatar>
                        <v-img :src="item.profileImage"></v-img>
                    </v-list-item-avatar>
                    <v-list-item-content>
                        <v-list-item-title v-html="item.nickname"></v-list-item-title>
                        <v-list-item-subtitle v-html="item.statusMessage"></v-list-item-subtitle>
                    </v-list-item-content>
                </v-list-item>
            </v-list>

        </v-sheet>
    </v-flex>
</template>


<script>

import {store} from '@/store/store'

export default {
    name: 'homePage',
    data () {
        return {
            model: null,
            teamInfo : [],
            loading: false
        }
    },
    async mounted() {
        await this.getTeamMemberList()
    },
    methods: {
        setCardColor(num) {
            if(num%2 === 0) {
                return '#4D4F69'
            }else {
                return '#9AD9D8'
            }
        },
        async getTeamMemberList() {

            var href = location.href.split('/');
            var payload = {
                teamId : href[href.length-2]
            }
            // 통신
            await store.dispatch("getTeamMemberList", payload);
            // 팀 정보(팀 이름, 팀원 리스트 세팅)
            this.teamInfo = store.getters.teamInfo
            console.log(this.teamInfo)
            this.loading = true;
            
        }
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

#card_title {
    font-weight: bold;
    font-size: 20px;
    color:white;
}
#card_date {
    font-weight: lighter;
    font-size: 13px;
}
#card_d_day {
    margin-top: 10px;
    font-weight: bold;
}

</style>
