import react from '@vitejs/plugin-react'

import { defineConfig } from 'vite'

// https://vite.dev/config/
export default defineConfig({
  plugins: [
    react(),
    // babel({ presets: [reactCompilerPreset()] }) -컴파일러 최적화
  ],
})
