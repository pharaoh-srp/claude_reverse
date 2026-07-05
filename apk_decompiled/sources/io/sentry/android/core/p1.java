package io.sentry.android.core;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import defpackage.hjb;
import defpackage.pya;
import io.sentry.t5;

/* JADX INFO: loaded from: classes.dex */
public final class p1 implements SensorEventListener {
    public SensorManager a;
    public Sensor b;
    public HandlerThread c;
    public Handler d;
    public volatile o1 e;
    public io.sentry.a1 f;
    public final hjb g = new hjb(3);

    public p1(io.sentry.a1 a1Var) {
        this.f = a1Var;
    }

    public final void a(Context context) {
        if (this.a == null) {
            this.a = (SensorManager) context.getSystemService("sensor");
        }
        SensorManager sensorManager = this.a;
        if (sensorManager != null && this.b == null) {
            this.b = sensorManager.getDefaultSensor(1, false);
        }
        if (this.b == null || this.c != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("sentry-shake");
        this.c = handlerThread;
        handlerThread.start();
        this.d = new Handler(this.c.getLooper());
    }

    public final void b(Activity activity, o1 o1Var) {
        this.e = o1Var;
        a(activity);
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            this.f.h(t5.WARNING, "SensorManager is not available. Shake detection disabled.", new Object[0]);
            return;
        }
        Sensor sensor = this.b;
        if (sensor == null) {
            this.f.h(t5.WARNING, "Accelerometer sensor not available. Shake detection disabled.", new Object[0]);
        } else {
            sensorManager.registerListener(this, sensor, 3, this.d);
        }
    }

    public final void c() {
        this.e = null;
        SensorManager sensorManager = this.a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        Handler handler = this.d;
        if (handler != null) {
            handler.post(new pya(20, this));
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        r15 = r3;
     */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSensorChanged(android.hardware.SensorEvent r19) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.p1.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
