package defpackage;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.LocaleList;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Surface;
import com.anthropic.claude.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class n11 implements d6b {
    public int E;
    public boolean F;
    public final Object G;
    public final Object H;
    public Object I;
    public Object J;

    public n11() {
        this.G = new Intent("android.intent.action.VIEW");
        this.H = new ive(false);
        this.E = 0;
        this.F = true;
    }

    public static void j(n11 n11Var, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        xv8 xv8Var;
        LoudnessCodecController loudnessCodecController;
        q11 q11Var = (q11) n11Var.H;
        MediaCodec mediaCodec = (MediaCodec) n11Var.G;
        HandlerThread handlerThread = q11Var.b;
        fd9.M(q11Var.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(q11Var, handler);
        q11Var.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        ((f6b) n11Var.I).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (xv8Var = (xv8) n11Var.J) != null && ((loudnessCodecController = (LoudnessCodecController) xv8Var.H) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            fd9.M(((HashSet) xv8Var.F).add(mediaCodec));
        }
        n11Var.E = 1;
    }

    public static String l(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    public void A(Context context) {
        ((Intent) this.G).putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptions.makeCustomAnimation(context, R.anim.no_anim, R.anim.slide_out_bottom).toBundle());
    }

    public void B() {
        this.F = false;
    }

    public void C(int i) {
        Intent intent = (Intent) this.G;
        if (i < 0 || i > 2) {
            sz6.p("Invalid value for the shareState argument");
            return;
        }
        this.E = i;
        if (i == 1) {
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
        } else if (i == 2) {
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
        } else {
            intent.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
        }
    }

    public void D() {
        ((Intent) this.G).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
    }

    public void E(Context context) {
        this.I = ActivityOptions.makeCustomAnimation(context, R.anim.slide_in_bottom, R.anim.no_anim);
    }

    @Override // defpackage.d6b
    public void a() {
        xv8 xv8Var;
        xv8 xv8Var2;
        try {
            if (this.E == 1) {
                ((f6b) this.I).shutdown();
                q11 q11Var = (q11) this.H;
                synchronized (q11Var.a) {
                    q11Var.m = true;
                    q11Var.b.quit();
                    q11Var.a();
                }
            }
            this.E = 2;
            if (this.F) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    ((MediaCodec) this.G).stop();
                }
                if (i >= 35 && (xv8Var2 = (xv8) this.J) != null) {
                    xv8Var2.z((MediaCodec) this.G);
                }
                ((MediaCodec) this.G).release();
                this.F = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.F) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        ((MediaCodec) this.G).stop();
                    }
                    if (i2 >= 35 && (xv8Var = (xv8) this.J) != null) {
                        xv8Var.z((MediaCodec) this.G);
                    }
                    ((MediaCodec) this.G).release();
                    this.F = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.d6b
    public void b(Bundle bundle) {
        ((f6b) this.I).b(bundle);
    }

    @Override // defpackage.d6b
    public void c(int i, rc5 rc5Var, long j, int i2) {
        ((f6b) this.I).c(i, rc5Var, j, i2);
    }

    @Override // defpackage.d6b
    public void d(int i, int i2, int i3, long j) {
        ((f6b) this.I).d(i, i2, i3, j);
    }

    @Override // defpackage.d6b
    public void e(int i) {
        ((MediaCodec) this.G).releaseOutputBuffer(i, false);
    }

    @Override // defpackage.d6b
    public MediaFormat f() {
        MediaFormat mediaFormat;
        q11 q11Var = (q11) this.H;
        synchronized (q11Var.a) {
            try {
                mediaFormat = q11Var.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.d6b
    public void flush() {
        ((f6b) this.I).flush();
        ((MediaCodec) this.G).flush();
        q11 q11Var = (q11) this.H;
        synchronized (q11Var.a) {
            q11Var.l++;
            Handler handler = q11Var.c;
            String str = tpi.a;
            handler.post(new fc(2, q11Var));
        }
        ((MediaCodec) this.G).start();
    }

    @Override // defpackage.d6b
    public void g() {
        ((MediaCodec) this.G).detachOutputSurface();
    }

    @Override // defpackage.d6b
    public void h(int i, long j) {
        ((MediaCodec) this.G).releaseOutputBuffer(i, j);
    }

    @Override // defpackage.d6b
    public int i() {
        ((f6b) this.I).h();
        q11 q11Var = (q11) this.H;
        synchronized (q11Var.a) {
            try {
                q11Var.b();
                int i = -1;
                if (q11Var.l > 0 || q11Var.m) {
                    return -1;
                }
                dg3 dg3Var = q11Var.d;
                int i2 = dg3Var.b;
                int i3 = dg3Var.c;
                if (!(i2 == i3)) {
                    if (i2 == i3) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i = ((int[]) dg3Var.e)[i2];
                    dg3Var.b = (i2 + 1) & dg3Var.d;
                }
                return i;
            } finally {
            }
        }
    }

    public epk k() {
        Intent intent = (Intent) this.G;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.F);
        intent.putExtras(((ive) this.H).j().M());
        Bundle bundle2 = (Bundle) this.J;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.E);
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            if (((ActivityOptions) this.I) == null) {
                this.I = ActivityOptions.makeBasic();
            }
            i5.j((ActivityOptions) this.I);
        }
        if (i >= 36) {
            if (((ActivityOptions) this.I) == null) {
                this.I = ActivityOptions.makeBasic();
            }
            e6.e((ActivityOptions) this.I, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        ActivityOptions activityOptions = (ActivityOptions) this.I;
        return new epk(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    @Override // defpackage.d6b
    public int m(MediaCodec.BufferInfo bufferInfo) {
        ((f6b) this.I).h();
        q11 q11Var = (q11) this.H;
        synchronized (q11Var.a) {
            try {
                q11Var.b();
                if (q11Var.l > 0 || q11Var.m) {
                    return -1;
                }
                dg3 dg3Var = q11Var.e;
                int i = dg3Var.b;
                int i2 = dg3Var.c;
                if (i == i2) {
                    return -1;
                }
                if (i == i2) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i3 = ((int[]) dg3Var.e)[i];
                dg3Var.b = dg3Var.d & (i + 1);
                if (i3 >= 0) {
                    q11Var.h.getClass();
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) q11Var.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i3 == -2) {
                    q11Var.h = (MediaFormat) q11Var.g.remove();
                }
                return i3;
            } finally {
            }
        }
    }

    @Override // defpackage.d6b
    public boolean n(ro6 ro6Var) {
        q11 q11Var = (q11) this.H;
        synchronized (q11Var.a) {
            q11Var.o = ro6Var;
        }
        return true;
    }

    @Override // defpackage.d6b
    public void o(int i) {
        ((MediaCodec) this.G).setVideoScalingMode(i);
    }

    public void p() {
        ((Intent) this.G).putExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", true);
    }

    public void q() {
        ((Intent) this.G).putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON", true);
    }

    @Override // defpackage.d6b
    public ByteBuffer r(int i) {
        return ((MediaCodec) this.G).getInputBuffer(i);
    }

    @Override // defpackage.d6b
    public void s(Surface surface) {
        ((MediaCodec) this.G).setOutputSurface(surface);
    }

    @Override // defpackage.d6b
    public ByteBuffer t(int i) {
        return ((MediaCodec) this.G).getOutputBuffer(i);
    }

    @Override // defpackage.d6b
    public void u(yw5 yw5Var) {
        q11 q11Var = (q11) this.H;
        fd fdVar = new fd(this, 2, yw5Var);
        synchronized (q11Var.a) {
            q11Var.b();
            fdVar.run();
        }
    }

    @Override // defpackage.d6b
    public void v(ArrayList arrayList) {
        ((MediaCodec) this.G).subscribeToVendorParameters(arrayList);
    }

    @Override // defpackage.d6b
    public void w(w6b w6bVar, Handler handler) {
        ((MediaCodec) this.G).setOnFrameRenderedListener(new k11(this, w6bVar, 0), handler);
    }

    @Override // defpackage.d6b
    public void x(ArrayList arrayList) {
        ((MediaCodec) this.G).unsubscribeFromVendorParameters(arrayList);
    }

    public void y(poj pojVar) {
        this.J = pojVar.M();
    }

    public void z() {
        ((Intent) this.G).putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON", true);
    }

    public n11(MediaCodec mediaCodec, HandlerThread handlerThread, f6b f6bVar, xv8 xv8Var) {
        this.G = mediaCodec;
        this.H = new q11(handlerThread);
        this.I = f6bVar;
        this.J = xv8Var;
        this.E = 0;
    }
}
