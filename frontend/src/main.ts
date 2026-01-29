import {createApp} from 'vue'
import {createPinia} from 'pinia'
import PrimeVue from 'primevue/config';

import App from './App.vue'
import router from './router'
import {Button} from 'primevue';

import './style.css'
import {DefaultTheme} from "@/theme/default.ts";

const app = createApp(App)

app.use(createPinia())
app.use(router)
app.use(PrimeVue, {
    theme: {
        preset: DefaultTheme,
        options: {
            darkModeSelector: false
        }
    }
})

app.component('Button', Button);

app.mount('#app')
