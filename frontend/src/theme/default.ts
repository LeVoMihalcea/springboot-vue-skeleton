import {definePreset, palette} from "@primeuix/themes";
import Aura from '@primeuix/themes/aura';

export const DefaultTheme = definePreset(Aura, {
    semantic: {
        primary: palette('#031021'),
        accent: palette('#D42126'),
    },
    components: {
        button: {
            colorScheme: {
                light: {
                    root: {
                        primary: {
                            color: '{neutral.50}',
                            background: '{accent.500}',
                            borderColor: '{accent.500}',

                            hoverColor: '{neutral.50}',
                            hoverBackground: '{accent.500}',
                            hoverBorderColor: '{accent.500}',
                        },
                    },
                },
            },
        },
    },
});
