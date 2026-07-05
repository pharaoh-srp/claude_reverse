package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class v41 {
    public final nyg a;
    public final Handler b;
    public d87 c;
    public p31 d;
    public int f;
    public w41 h;
    public float g = 1.0f;
    public int e = 0;

    public v41(Context context, Looper looper, d87 d87Var) {
        this.a = knk.C(new u41(context, 0));
        this.c = d87Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        int i = this.e;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.a.get();
        AudioFocusRequest audioFocusRequest = this.h.e;
        audioFocusRequest.getClass();
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public final void b(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        d87 d87Var = this.c;
        if (d87Var != null) {
            d87Var.L.f(34);
        }
    }

    public final int c(int i, boolean z) {
        int i2;
        t tVar;
        if (i == 1 || (i2 = this.f) != 1) {
            a();
            b(0);
            return 1;
        }
        int i3 = this.e;
        if (z) {
            if (i3 != 2) {
                w41 w41Var = this.h;
                if (w41Var == null) {
                    if (w41Var == null) {
                        tVar = new t();
                        tVar.c = p31.b;
                        tVar.a = i2;
                    } else {
                        t tVar2 = new t();
                        tVar2.a = w41Var.a;
                        tVar2.c = w41Var.d;
                        tVar = tVar2;
                    }
                    p31 p31Var = this.d;
                    p31Var.getClass();
                    tVar.c = p31Var;
                    tVar.b = true;
                    t41 t41Var = new t41(0, this);
                    Handler handler = this.b;
                    handler.getClass();
                    this.h = new w41(tVar.a, t41Var, handler, (p31) tVar.c, tVar.b);
                }
                AudioManager audioManager = (AudioManager) this.a.get();
                AudioFocusRequest audioFocusRequest = this.h.e;
                audioFocusRequest.getClass();
                int iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
                if (iRequestAudioFocus == 1 || iRequestAudioFocus == 2) {
                    b(2);
                    return 1;
                }
                b(1);
                return -1;
            }
        } else {
            if (i3 == 1) {
                return -1;
            }
            if (i3 == 3) {
                return 0;
            }
        }
        return 1;
    }
}
