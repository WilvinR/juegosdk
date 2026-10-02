# Ashlands 0.1.0 — versión plana para subida desde Android

Todos los archivos están deliberadamente en una sola carpeta para poder seleccionarlos desde el selector de archivos de Android.

## Subida a GitHub

Sube todos los archivos de esta carpeta al directorio raíz del repositorio `WilvinR/juegosdk`.

Importante: el archivo `android.yml` debe renombrarse a `.github/workflows/android.yml` para que GitHub Actions lo detecte. Si la interfaz web de GitHub no permite crear esa ruta cómodamente, usa el editor web de GitHub para crear `.github/workflows/android.yml` y pega allí el contenido de `android.yml`.

## Compilación

El workflow instala JDK 17, Android SDK 36 y Gradle 9.6 en GitHub Actions y genera:

`build/outputs/apk/debug/app-debug.apk`

El APK aparece en Actions como el artefacto `ashlands-0.1.0-debug-apk`.
