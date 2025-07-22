import { ApplicationConfig, importProvidersFrom, provideZoneChangeDetection } from '@angular/core';
import { provideRouter } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

import { routes } from './app.routes';

export const appConfig: ApplicationConfig = {
  providers: [
    importProvidersFrom(HttpClientModule),  // <-- Add this line to import HttpClientModule providers
    provideZoneChangeDetection({ eventCoalescing: true }),
    provideRouter(routes)
  ]
};
