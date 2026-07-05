package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pi1 {
    public static final lyk o = new lyk(24);
    public static int p;
    public static int q;
    public final AudioManager a;
    public final p41 b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final zy1 g;
    public final ih2 h;
    public volatile AudioFocusRequest i;
    public volatile boolean j;
    public volatile boolean k;
    public final jxb l;
    public final lsc m;
    public Boolean n;

    public pi1(AudioManager audioManager, p41 p41Var, boolean z, boolean z2) {
        this.a = audioManager;
        this.b = p41Var;
        this.c = z;
        this.d = z2;
        this.e = (!z2 || Build.VERSION.SDK_INT < 36) ? 2 : 16;
        this.f = (!z2 || Build.VERSION.SDK_INT < 36) ? 0 : 3;
        zy1 zy1VarP = wd6.P(Integer.MAX_VALUE, 6, null);
        this.g = zy1VarP;
        this.h = j8.b0(zy1VarP);
        this.l = new jxb();
        this.m = mpk.P(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.li1
            if (r0 == 0) goto L13
            r0 = r5
            li1 r0 = (defpackage.li1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            li1 r0 = new li1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            m45 r1 = defpackage.m45.E
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.sf5.h0(r5)
            goto L40
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.sf5.h0(r5)
            android.media.AudioFocusRequest r5 = r4.i
            if (r5 == 0) goto L40
            p41 r5 = r4.b
            r0.G = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            lyk r5 = defpackage.pi1.o
            monitor-enter(r5)
            boolean r0 = r4.j     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L4d
            iei r4 = defpackage.iei.a     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r5)
            return r4
        L4b:
            r4 = move-exception
            goto L8b
        L4d:
            int r0 = defpackage.pi1.p     // Catch: java.lang.Throwable -> L4b
            int r1 = r0 + 1
            defpackage.pi1.p = r1     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto L61
            android.media.AudioManager r0 = r4.a     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L5e
            int r0 = r0.getMode()     // Catch: java.lang.Throwable -> L4b
            goto L5f
        L5e:
            r0 = 0
        L5f:
            defpackage.pi1.q = r0     // Catch: java.lang.Throwable -> L4b
        L61:
            r4.j = r3     // Catch: java.lang.Throwable -> L4b
            android.media.AudioManager r0 = r4.a     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto L6b
            iei r4 = defpackage.iei.a     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r5)
            return r4
        L6b:
            boolean r4 = r4.d     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L83
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L4b
            r1 = 36
            if (r4 < r1) goto L83
            r4 = 7
            r0.setMode(r4)     // Catch: java.lang.Throwable -> L4b
            int r1 = r0.getMode()     // Catch: java.lang.Throwable -> L4b
            if (r1 != r4) goto L83
            iei r4 = defpackage.iei.a     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r5)
            return r4
        L83:
            r4 = 3
            r0.setMode(r4)     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r5)
            iei r4 = defpackage.iei.a
            return r4
        L8b:
            monitor-exit(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi1.a(vp4):java.lang.Object");
    }

    public final void b() {
        AudioManager audioManager;
        synchronized (o) {
            if (this.j) {
                this.j = false;
                int i = p - 1;
                p = i;
                if (i == 0 && (audioManager = this.a) != null) {
                    audioManager.setMode(q);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.vp4 r11) throws java.lang.Throwable {
        /*
            r10 = this;
            iei r0 = defpackage.iei.a
            boolean r1 = r11 instanceof defpackage.mi1
            if (r1 == 0) goto L15
            r1 = r11
            mi1 r1 = (defpackage.mi1) r1
            int r2 = r1.H
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.H = r2
            goto L1a
        L15:
            mi1 r1 = new mi1
            r1.<init>(r10, r11)
        L1a:
            java.lang.Object r11 = r1.F
            m45 r2 = defpackage.m45.E
            int r3 = r1.H
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L3f
            if (r3 == r5) goto L38
            if (r3 != r4) goto L32
            hxb r10 = r1.E
            defpackage.sf5.h0(r11)     // Catch: java.lang.Throwable -> L2f
            goto L7f
        L2f:
            r11 = move-exception
            goto L90
        L32:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r10)
            return r6
        L38:
            hxb r3 = r1.E
            defpackage.sf5.h0(r11)
            r11 = r3
            goto L4f
        L3f:
            defpackage.sf5.h0(r11)
            jxb r11 = r10.l
            r1.E = r11
            r1.H = r5
            java.lang.Object r3 = r11.c(r1)
            if (r3 != r2) goto L4f
            goto L7b
        L4f:
            boolean r3 = r10.d()     // Catch: java.lang.Throwable -> L83
            if (r3 != 0) goto L8c
            boolean r3 = r10.k     // Catch: java.lang.Throwable -> L83
            if (r3 == 0) goto L5a
            goto L8c
        L5a:
            lsc r3 = r10.m     // Catch: java.lang.Throwable -> L83
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L83
            r3.setValue(r5)     // Catch: java.lang.Throwable -> L83
            r10.b()     // Catch: java.lang.Throwable -> L83
            android.media.AudioFocusRequest r3 = r10.i     // Catch: java.lang.Throwable -> L83
            if (r3 == 0) goto L88
            b6c r5 = defpackage.b6c.F     // Catch: java.lang.Throwable -> L83
            g9 r7 = new g9     // Catch: java.lang.Throwable -> L83
            r8 = 16
            r7.<init>(r10, r3, r6, r8)     // Catch: java.lang.Throwable -> L83
            r1.E = r11     // Catch: java.lang.Throwable -> L83
            r1.H = r4     // Catch: java.lang.Throwable -> L83
            java.lang.Object r10 = defpackage.gb9.c0(r5, r7, r1)     // Catch: java.lang.Throwable -> L83
            if (r10 != r2) goto L7c
        L7b:
            return r2
        L7c:
            r9 = r11
            r11 = r10
            r10 = r9
        L7f:
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch: java.lang.Throwable -> L2f
            r11 = r10
            goto L88
        L83:
            r10 = move-exception
            r9 = r11
            r11 = r10
            r10 = r9
            goto L90
        L88:
            r11.d(r6)
            return r0
        L8c:
            r11.d(r6)
            return r0
        L90:
            r10.d(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi1.c(vp4):java.lang.Object");
    }

    public final boolean d() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.vp4 r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.ni1
            if (r0 == 0) goto L13
            r0 = r10
            ni1 r0 = (defpackage.ni1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            ni1 r0 = new ni1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.F
            m45 r1 = defpackage.m45.E
            int r2 = r0.H
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            hxb r9 = r0.E
            defpackage.sf5.h0(r10)     // Catch: java.lang.Throwable -> L2d
            goto L8a
        L2d:
            r10 = move-exception
            goto L93
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            return r5
        L35:
            hxb r2 = r0.E
            defpackage.sf5.h0(r10)
            r10 = r2
            goto L4c
        L3c:
            defpackage.sf5.h0(r10)
            jxb r10 = r9.l
            r0.E = r10
            r0.H = r4
            java.lang.Object r2 = r10.c(r0)
            if (r2 != r1) goto L4c
            goto L88
        L4c:
            boolean r2 = r9.k     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L5b
            iei r9 = defpackage.iei.a     // Catch: java.lang.Throwable -> L56
            r10.d(r5)
            return r9
        L56:
            r9 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
            goto L93
        L5b:
            r9.k = r4     // Catch: java.lang.Throwable -> L56
            r9.b()     // Catch: java.lang.Throwable -> L56
            lyk r2 = defpackage.pi1.o     // Catch: java.lang.Throwable -> L56
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L56
            int r6 = defpackage.pi1.p     // Catch: java.lang.Throwable -> L90
            if (r6 != 0) goto L68
            goto L69
        L68:
            r4 = 0
        L69:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L71
            p41 r2 = r9.b     // Catch: java.lang.Throwable -> L56
            r2.f()     // Catch: java.lang.Throwable -> L56
        L71:
            android.media.AudioFocusRequest r2 = r9.i     // Catch: java.lang.Throwable -> L56
            r9.i = r5     // Catch: java.lang.Throwable -> L56
            b6c r4 = defpackage.b6c.F     // Catch: java.lang.Throwable -> L56
            m0 r6 = new m0     // Catch: java.lang.Throwable -> L56
            r7 = 27
            r6.<init>(r2, r9, r5, r7)     // Catch: java.lang.Throwable -> L56
            r0.E = r10     // Catch: java.lang.Throwable -> L56
            r0.H = r3     // Catch: java.lang.Throwable -> L56
            java.lang.Object r9 = defpackage.gb9.c0(r4, r6, r0)     // Catch: java.lang.Throwable -> L56
            if (r9 != r1) goto L89
        L88:
            return r1
        L89:
            r9 = r10
        L8a:
            iei r10 = defpackage.iei.a     // Catch: java.lang.Throwable -> L2d
            r9.d(r5)
            return r10
        L90:
            r9 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L56
            throw r9     // Catch: java.lang.Throwable -> L56
        L93:
            r9.d(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi1.e(vp4):java.lang.Object");
    }

    public final boolean f() {
        if (!this.c || this.a == null) {
            return true;
        }
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(4).setAudioAttributes(new AudioAttributes.Builder().setUsage(this.e).setContentType(1).build()).setOnAudioFocusChangeListener(new t41(1, this)).build();
        if (this.a.requestAudioFocus(audioFocusRequestBuild) == 1) {
            this.i = audioFocusRequestBuild;
            this.n = Boolean.TRUE;
            return true;
        }
        List list = xah.a;
        xah.e(2, "Bell Mode: audio focus denied", null, sta.h0(new cpc("active_playback_usages", gwk.k(this.a)), new cpc("active_recording_sources", gwk.l(this.a))));
        this.n = Boolean.FALSE;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.vp4 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.oi1
            if (r0 == 0) goto L13
            r0 = r9
            oi1 r0 = (defpackage.oi1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            oi1 r0 = new oi1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.F
            m45 r1 = defpackage.m45.E
            int r2 = r0.H
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L37
            if (r2 != r3) goto L31
            hxb r8 = r0.E
            defpackage.sf5.h0(r9)     // Catch: java.lang.Throwable -> L2e
            goto L9d
        L2e:
            r9 = move-exception
            goto La3
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r5
        L37:
            hxb r2 = r0.E
            defpackage.sf5.h0(r9)
            r9 = r2
            goto L4e
        L3e:
            defpackage.sf5.h0(r9)
            jxb r9 = r8.l
            r0.E = r9
            r0.H = r4
            java.lang.Object r2 = r9.c(r0)
            if (r2 != r1) goto L4e
            goto L9b
        L4e:
            boolean r2 = r8.k     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L5d
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L58
            r9.d(r5)
            return r8
        L58:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto La3
        L5d:
            boolean r2 = r8.d()     // Catch: java.lang.Throwable -> L58
            if (r2 != 0) goto L69
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L58
            r9.d(r5)
            return r8
        L69:
            android.media.AudioFocusRequest r2 = r8.i     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L8a
            java.lang.Boolean r6 = r8.n     // Catch: java.lang.Throwable -> L58
            if (r6 == 0) goto L8a
            android.media.AudioManager r6 = r8.a     // Catch: java.lang.Throwable -> L58
            if (r6 == 0) goto L7c
            int r2 = r6.requestAudioFocus(r2)     // Catch: java.lang.Throwable -> L58
            if (r2 != r4) goto L7c
            goto L8a
        L7c:
            java.util.List r8 = defpackage.xah.a     // Catch: java.lang.Throwable -> L58
            java.lang.String r8 = "Bell Mode: resume focus denied, staying held"
            r0 = 6
            defpackage.xah.e(r0, r8, r5, r5)     // Catch: java.lang.Throwable -> L58
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L58
            r9.d(r5)
            return r8
        L8a:
            lsc r2 = r8.m     // Catch: java.lang.Throwable -> L58
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L58
            r2.setValue(r4)     // Catch: java.lang.Throwable -> L58
            r0.E = r9     // Catch: java.lang.Throwable -> L58
            r0.H = r3     // Catch: java.lang.Throwable -> L58
            java.lang.Object r8 = r8.a(r0)     // Catch: java.lang.Throwable -> L58
            if (r8 != r1) goto L9c
        L9b:
            return r1
        L9c:
            r8 = r9
        L9d:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2e
            r8.d(r5)
            return r9
        La3:
            r8.d(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi1.g(vp4):java.lang.Object");
    }
}
