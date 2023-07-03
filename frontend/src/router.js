
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import InspectionManager from "./components/listers/InspectionCards"
import InspectionDetail from "./components/listers/InspectionDetail"
import PaymentManager from "./components/listers/PaymentCards"
import PaymentDetail from "./components/listers/PaymentDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/inspections',
                name: 'InspectionManager',
                component: InspectionManager
            },
            {
                path: '/inspections/:id',
                name: 'InspectionDetail',
                component: InspectionDetail
            },
            {
                path: '/payments',
                name: 'PaymentManager',
                component: PaymentManager
            },
            {
                path: '/payments/:id',
                name: 'PaymentDetail',
                component: PaymentDetail
            },



    ]
})
