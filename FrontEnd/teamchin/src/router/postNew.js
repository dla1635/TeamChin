import PostNewPage from '@/pages/PostNewPage'
import BoardNew from '@/components/BoardNew'
import NoticeNew from '@/components/NoticeNew'
import VoteNew from '@/components/VoteNew'

export default {
  path: '/',
  name: 'New',
  component: PostNewPage,
  children: [
      {
        path: '/board/new',
        name: 'BoardNew',
        component: BoardNew
      },
      {
        path: '/notice/new',
        name: 'NoticeNew',
        component: NoticeNew
      },
      {
        path: '/vote/new',
        name: 'VoteNew',
        component: VoteNew
      }
  ]
}
