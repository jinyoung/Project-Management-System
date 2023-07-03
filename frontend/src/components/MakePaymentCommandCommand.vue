<template>
    <v-card outlined>
        <v-card-title>
            MakePaymentCommand
        </v-card-title>

        <v-card-text>
            <PaymentType offline label="PaymentType" v-model="value.paymentType" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="makePaymentCommand"
            >
                MakePaymentCommand
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'MakePaymentCommandCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.paymentType = {};
        },
        watch: {
        },
        methods: {
            makePaymentCommand() {
                this.$emit('makePaymentCommand', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

