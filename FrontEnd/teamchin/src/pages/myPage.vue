<template>
    <v-flex>

        <!-- 내 정보 네비게이션 -->
        <v-app-bar v-if="loading" id="homeHeader" app flat>
                <v-btn icon>
                <v-icon>back</v-icon>
            </v-btn>

            <v-spacer></v-spacer>
            <v-toolbar-title>내 정보</v-toolbar-title>
            <v-spacer></v-spacer>
            
        </v-app-bar>
        <!-- top네비 -->
        <v-sheet style="margin:50px 0;">
            <v-list flat>
                <v-subheader>REPORTS</v-subheader>
                <v-list-item-group v-model="item" color="primary">
                    <v-list-item>
                        <v-list-item-content>
                            <v-list-item-title>프로필 이미지 변경</v-list-item-title>
                        </v-list-item-content>
                        <v-list-item-content>
                            <v-list-item-title>닉네임 변경</v-list-item-title>
                        </v-list-item-content>
                        <v-list-item-content>
                            <v-list-item-title>로그아웃</v-list-item-title>
                        </v-list-item-content>
                    </v-list-item>
                </v-list-item-group>
            </v-list>
            
            <v-avatar>
                <img src="https://data.ac-illust.com/data/thumbnails/0b/0bece6e3d5721ebbf2d827c65fae664e_t.jpeg">
            </v-avatar>
            
           
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
