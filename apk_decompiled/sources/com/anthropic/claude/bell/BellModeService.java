package com.anthropic.claude.bell;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.anthropic.claude.R;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.OrganizationId;
import defpackage.am0;
import defpackage.bg9;
import defpackage.bj0;
import defpackage.bz7;
import defpackage.ci1;
import defpackage.cj;
import defpackage.cm1;
import defpackage.co1;
import defpackage.cpc;
import defpackage.d4c;
import defpackage.d7;
import defpackage.d7c;
import defpackage.dae;
import defpackage.dkb;
import defpackage.dl2;
import defpackage.dm1;
import defpackage.dmc;
import defpackage.e45;
import defpackage.ej1;
import defpackage.em1;
import defpackage.er9;
import defpackage.fd9;
import defpackage.fk0;
import defpackage.fkg;
import defpackage.fn1;
import defpackage.g09;
import defpackage.g51;
import defpackage.gb9;
import defpackage.gj1;
import defpackage.h86;
import defpackage.hr9;
import defpackage.ij0;
import defpackage.iuj;
import defpackage.jce;
import defpackage.jud;
import defpackage.jzg;
import defpackage.k70;
import defpackage.k7c;
import defpackage.kce;
import defpackage.ki1;
import defpackage.koi;
import defpackage.l6;
import defpackage.lz1;
import defpackage.m7f;
import defpackage.mn5;
import defpackage.mp4;
import defpackage.mr9;
import defpackage.myg;
import defpackage.myh;
import defpackage.n8c;
import defpackage.nai;
import defpackage.nib;
import defpackage.nz2;
import defpackage.o0;
import defpackage.o1j;
import defpackage.o7c;
import defpackage.ozf;
import defpackage.p41;
import defpackage.pi1;
import defpackage.pt2;
import defpackage.qi3;
import defpackage.ql3;
import defpackage.r7c;
import defpackage.rw1;
import defpackage.sta;
import defpackage.sz6;
import defpackage.tn1;
import defpackage.tp4;
import defpackage.u4j;
import defpackage.uh6;
import defpackage.um1;
import defpackage.un1;
import defpackage.uzc;
import defpackage.v0;
import defpackage.v40;
import defpackage.vn1;
import defpackage.x44;
import defpackage.x51;
import defpackage.xah;
import defpackage.xn1;
import defpackage.y31;
import defpackage.y49;
import defpackage.yh1;
import defpackage.yh7;
import defpackage.zh6;
import defpackage.zh7;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class BellModeService extends Service implements hr9 {
    public static final long Q;
    public static final long R;
    public static final long S;
    public static volatile bz7 T;
    public tn1 E;
    public String F;
    public MediaSession G;
    public final cm1 H = new cm1(this);
    public final h86 I;
    public final mn5 J;
    public final bj0 K;
    public mp4 L;
    public fkg M;
    public fkg N;
    public long O;
    public volatile boolean P;

    static {
        lz1 lz1Var = uh6.F;
        zh6 zh6Var = zh6.MINUTES;
        Q = v40.Q(1, zh6Var);
        R = v40.Q(30, zh6Var);
        S = v40.Q(1, zh6.SECONDS);
    }

    public BellModeService() {
        m7f m7fVar = (m7f) gb9.y().c.I;
        kce kceVar = jce.a;
        h86 h86Var = (h86) m7fVar.a(kceVar.b(h86.class), null, null);
        this.I = h86Var;
        this.J = (mn5) ((m7f) gb9.y().c.I).a(kceVar.b(mn5.class), null, null);
        this.K = (bj0) ((m7f) gb9.y().c.I).a(kceVar.b(bj0.class), null, null);
        e45 e45Var = h86Var.getDefault();
        myg mygVarG = iuj.g();
        e45Var.getClass();
        this.L = fd9.c(nai.Z(e45Var, mygVarG));
    }

    public final Notification a(boolean z, boolean z2) {
        ComponentName componentName = new ComponentName(getPackageName(), "com.anthropic.claude.deeplink.DeepLinkActivity");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setComponent(componentName);
        intent.setFlags(805306368);
        String str = this.F;
        if (str != null) {
            intent.putExtra("com.anthropic.claude.intent.extra.CHAT_ID", str);
        }
        PendingIntent activity = PendingIntent.getActivity(this, 500, intent, 201326592);
        Intent intent2 = new Intent(this, (Class<?>) BellModeService.class);
        intent2.setAction("com.anthropic.claude.bell.STOP");
        PendingIntent service = PendingIntent.getService(this, 503, intent2, 201326592);
        Intent intent3 = new Intent(this, (Class<?>) BellModeService.class);
        intent3.setAction("com.anthropic.claude.bell.TOGGLE_MUTE");
        PendingIntent service2 = PendingIntent.getService(this, 504, intent3, 201326592);
        tn1 tn1Var = this.E;
        boolean z3 = tn1Var != null && tn1Var.y();
        tn1 tn1Var2 = this.E;
        boolean z4 = tn1Var2 != null && tn1Var2.g.c();
        k7c k7cVarA = new rw1(IconCompat.b(this, z3 ? R.drawable.anthropicon_microphone_slash : R.drawable.anthropicon_microphone), getString(z3 ? R.string.button_unmute : R.string.button_mute), service2).a();
        long j = (getResources().getConfiguration().uiMode & 48) == 32 ? yh7.a : zh7.b;
        o7c o7cVar = new o7c(this, "voice_mode_notification_channel_v2");
        o7cVar.e = o7c.d(getString(R.string.notification_title));
        Notification notification = o7cVar.z;
        notification.icon = R.drawable.claude_spark;
        o7cVar.s = d4c.n0(j);
        o7cVar.o = true;
        o7cVar.p = true;
        o7cVar.j(2, true);
        o7cVar.j(16, false);
        o7cVar.q = "call";
        notification.when = this.O;
        o7cVar.k = true;
        o7cVar.l = true;
        o7cVar.g = activity;
        notification.deleteIntent = service;
        o7cVar.x = 1;
        o7cVar.A = z;
        if (!z2 || Build.VERSION.SDK_INT < 31) {
            if (!z4) {
                o7cVar.b(k7cVarA);
            }
            o7cVar.a(0, service, getString(R.string.button_stop));
        } else {
            CharSequence charSequenceLoadLabel = getApplicationInfo().loadLabel(getPackageManager());
            IconCompat iconCompatB = IconCompat.b(this, R.drawable.claude_spark);
            uzc uzcVar = new uzc();
            uzcVar.a = charSequenceLoadLabel;
            uzcVar.b = iconCompatB;
            uzcVar.c = null;
            uzcVar.d = null;
            uzcVar.e = false;
            uzcVar.f = true;
            Objects.requireNonNull(service, "hangUpIntent is required");
            r7c r7cVar = new r7c();
            if (TextUtils.isEmpty(charSequenceLoadLabel)) {
                sz6.p("person must have a non-empty a name");
                return null;
            }
            r7cVar.e = 2;
            r7cVar.f = uzcVar;
            r7cVar.g = null;
            r7cVar.h = null;
            r7cVar.i = service;
            o7cVar.o(r7cVar);
            if (!z4) {
                o7cVar.b(k7cVarA);
            }
        }
        Notification notificationC = o7cVar.c();
        notificationC.getClass();
        return notificationC;
    }

    public final void b(o1j o1jVar, long j, boolean z) {
        o1jVar.getClass();
        boolean zAreNotificationsEnabled = new n8c(this).b.areNotificationsEnabled();
        tn1 tn1Var = this.E;
        if (tn1Var != null) {
            tn1Var.w.setValue(Boolean.TRUE);
            if (!zAreNotificationsEnabled) {
                tn1Var.L(true);
            }
        }
        fkg fkgVar = this.N;
        tp4 tp4Var = null;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        h86 h86Var = this.I;
        if (zAreNotificationsEnabled && z) {
            this.N = gb9.D(this.L, h86Var.a(), null, new cj(this, tp4Var, 6), 2);
        }
        tn1 tn1Var2 = this.E;
        boolean z2 = (tn1Var2 == null || !tn1Var2.g.c() || o1jVar == o1j.F) ? false : true;
        if (!z2) {
            j = zAreNotificationsEnabled ? R : Q;
        }
        long j2 = j;
        fkg fkgVar2 = this.M;
        if (fkgVar2 != null) {
            fkgVar2.d(null);
        }
        this.M = gb9.D(this.L, h86Var.a(), null, new k70(j2, this, z2, (tp4) null), 2);
    }

    public final void c() {
        this.P = false;
        MediaSession mediaSession = this.G;
        if (mediaSession != null) {
            mediaSession.setActive(false);
        }
        MediaSession mediaSession2 = this.G;
        if (mediaSession2 != null) {
            mediaSession2.release();
        }
        this.G = null;
        tn1 tn1Var = this.E;
        if (tn1Var != null) {
            tn1Var.f();
        }
        this.E = null;
        this.O = 0L;
        fd9.z(this.L, null);
        stopForeground(1);
        new n8c(this).b.cancel(null, 500);
        stopSelf();
    }

    public final fn1 d(String str, String str2, String str3, String str4, String str5, boolean z, o1j o1jVar, String str6, String str7) {
        str.getClass();
        o1jVar.getClass();
        str6.getClass();
        str7.getClass();
        fkg fkgVar = this.M;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.M = null;
        fkg fkgVar2 = this.N;
        if (fkgVar2 != null) {
            fkgVar2.d(null);
        }
        this.N = null;
        this.F = str;
        boolean zD0 = fd9.d0(this.L);
        h86 h86Var = this.I;
        if (!zD0) {
            e45 e45Var = h86Var.getDefault();
            myg mygVarG = iuj.g();
            e45Var.getClass();
            this.L = fd9.c(nai.Z(e45Var, mygVarG));
        }
        tn1 tn1Var = this.E;
        if (tn1Var != null) {
            koi koiVar = tn1Var.i;
            boolean z2 = ChatId.m981equalsimpl0(tn1Var.a, str) && AccountId.m946equalsimpl0(koiVar.d, str6) && OrganizationId.m1068equalsimpl0(koiVar.e, str7);
            if (z2) {
                tn1Var.w.setValue(Boolean.FALSE);
                if (!tn1Var.g.c()) {
                    tn1Var.L(false);
                }
            }
            if (z2) {
                return tn1Var;
            }
            tn1 tn1Var2 = this.E;
            if (tn1Var2 != null) {
                tn1Var2.f();
            }
            this.E = null;
            fd9.z(this.L, null);
            e45 e45Var2 = h86Var.getDefault();
            myg mygVarG2 = iuj.g();
            e45Var2.getClass();
            this.L = fd9.c(nai.Z(e45Var2, mygVarG2));
            this.O = this.J.a();
        }
        m7f m7fVar = (m7f) gb9.y().c.I;
        kce kceVar = jce.a;
        m7f m7fVarB = ((ql3) m7fVar.a(kceVar.b(ql3.class), null, null)).a.b(ij0.k("UserScope:", str6, ":", str7));
        if (m7fVarB == null) {
            m7fVarB = null;
        }
        if (m7fVarB == null) {
            SilentException.a(new SilentException(ij0.k("BellModeService: UserScope missing for account=", AccountId.m948toStringimpl(str6), " org=", OrganizationId.m1070toStringimpl(str7))), ozf.F, false, 2);
            stopSelf();
            return null;
        }
        mp4 mp4Var = this.L;
        mp4Var.getClass();
        Context context = (Context) m7fVarB.a(kceVar.b(Context.class), null, null);
        gj1 gj1Var = (gj1) m7fVarB.a(kceVar.b(gj1.class), null, null);
        h86 h86Var2 = (h86) m7fVarB.a(kceVar.b(h86.class), null, null);
        um1 um1Var = (um1) m7fVarB.a(kceVar.b(um1.class), null, null);
        fk0 fk0Var = (fk0) m7fVarB.a(kceVar.b(fk0.class), null, null);
        jzg jzgVar = (jzg) m7fVarB.a(kceVar.b(jzg.class), null, null);
        myh myhVar = (myh) m7fVarB.a(kceVar.b(myh.class), null, null);
        yh1 yh1Var = (yh1) m7fVarB.a(kceVar.b(yh1.class), null, null);
        bg9 bg9Var = (bg9) m7fVarB.a(kceVar.b(bg9.class), null, null);
        koi koiVar2 = (koi) m7fVarB.a(kceVar.b(koi.class), null, null);
        qi3 qi3Var = (qi3) m7fVarB.a(kceVar.b(qi3.class), null, null);
        dl2 dl2Var = (dl2) m7fVarB.a(kceVar.b(dl2.class), null, null);
        y49 y49Var = new y49();
        dmc dmcVar = new dmc();
        p41 p41Var = (p41) m7fVarB.a(kceVar.b(p41.class), null, null);
        Object systemService = context.getSystemService("audio");
        pi1 pi1Var = new pi1(systemService instanceof AudioManager ? (AudioManager) systemService : null, p41Var, ((Boolean) gj1Var.l.getValue()).booleanValue(), ((Boolean) gj1Var.o.getValue()).booleanValue());
        ki1 ki1Var = new ki1(pi1Var, (dkb) m7fVarB.a(kceVar.b(dkb.class), null, null), (y31) m7fVarB.a(kceVar.b(y31.class), null, null), p41Var, new d7(13, gj1Var), ((Boolean) gj1Var.r.getValue()).booleanValue() ? 3 : 0, y49Var, h86Var2);
        dae daeVar = new dae();
        daeVar.E = str3;
        dae daeVar2 = new dae();
        daeVar2.E = str4;
        dae daeVar3 = new dae();
        daeVar3.E = str5;
        m7f m7fVar2 = m7fVarB;
        ej1 ej1Var = new ej1(new v0(18, yh1Var), new un1(str, daeVar, str2, daeVar2, daeVar3, jzgVar, myhVar, um1Var, ki1Var, z, fk0Var), h86Var2);
        vn1 vn1Var = new vn1(0, daeVar);
        vn1 vn1Var2 = new vn1(1, daeVar2);
        vn1 vn1Var3 = new vn1(2, daeVar3);
        am0 am0Var = (am0) m7fVar2.a(kceVar.b(am0.class), null, null);
        ci1 ci1Var = new ci1(str, ej1Var, (pt2) m7fVar2.a(kceVar.b(pt2.class), null, null), (g09) m7fVar2.a(kceVar.b(g09.class), null, null), mp4Var);
        co1 co1Var = new co1(str, koiVar2, dl2Var, myhVar, qi3Var, mp4Var);
        jud judVar = new jud(str, dl2Var, koiVar2, qi3Var, mp4Var);
        xn1 xn1Var = new xn1(um1Var, fk0Var, ej1Var);
        u4j u4jVar = (u4j) m7fVar2.a(kceVar.b(u4j.class), null, null);
        if (m7fVar2.c(kceVar.b(g51.class)) != null) {
            mr9.o();
            return null;
        }
        x51 x51Var = new x51(48000, pi1Var.e);
        l6 l6Var = new l6(context, mp4Var, gj1Var, 10);
        tp4 tp4Var = null;
        nib nibVar = (nib) m7fVar2.a(kceVar.b(nib.class), null, null);
        nz2 nz2Var = (nz2) m7fVar2.a(kceVar.b(nz2.class), null, null);
        tn1 tn1Var3 = new tn1(str, o1jVar, vn1Var, vn1Var2, vn1Var3, mp4Var, h86Var2, gj1Var, um1Var, koiVar2, qi3Var, am0Var, jzgVar, myhVar, ci1Var, co1Var, judVar, xn1Var, u4jVar, ki1Var, ej1Var, x51Var, l6Var, y49Var, dmcVar, bg9Var, nibVar, nz2Var);
        this.E = tn1Var3;
        gb9.D(this.L, h86Var.a(), null, new o0(tn1Var3, this, tp4Var, 26), 2);
        f();
        gb9.D(this.L, null, null, new em1(tn1Var3, tp4Var, 0), 3);
        return tn1Var3;
    }

    @Override // defpackage.hr9
    public final /* bridge */ er9 e() {
        return gb9.y();
    }

    public final void f() {
        g(this.G);
        if (this.P) {
            Notification notificationA = a(true, true);
            try {
                NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
                if (notificationManager != null) {
                    notificationManager.notify(500, notificationA);
                }
            } catch (RuntimeException e) {
                List list = xah.a;
                ozf ozfVar = ozf.F;
                Map mapSingletonMap = Collections.singletonMap("category", "bell");
                mapSingletonMap.getClass();
                xah.f(e, "BellModeService: CallStyle re-post raced FGS teardown; dropped.", ozfVar, mapSingletonMap, 16);
            }
        }
    }

    public final void g(MediaSession mediaSession) {
        tn1 tn1Var = this.E;
        boolean z = false;
        if (tn1Var != null && tn1Var.y()) {
            z = true;
        }
        PlaybackState playbackStateBuild = new PlaybackState.Builder().setState(z ? 2 : 3, -1L, 1.0f).setActions(518L).build();
        if (mediaSession != null) {
            mediaSession.setPlaybackState(playbackStateBuild);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.H;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        f();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.P = false;
        super.onDestroy();
        MediaSession mediaSession = this.G;
        if (mediaSession != null) {
            mediaSession.setActive(false);
        }
        MediaSession mediaSession2 = this.G;
        if (mediaSession2 != null) {
            mediaSession2.release();
        }
        this.G = null;
        tn1 tn1Var = this.E;
        if (tn1Var != null) {
            tn1Var.f();
        }
        this.E = null;
        this.O = 0L;
        fd9.z(this.L, null);
        new n8c(this).b.cancel(null, 500);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ozf ozfVar = ozf.F;
        if (x44.r(intent != null ? intent.getAction() : null, "com.anthropic.claude.bell.TOGGLE_MUTE")) {
            tn1 tn1Var = this.E;
            if (tn1Var == null) {
                stopSelf();
                return 2;
            }
            if (!tn1Var.g.c() && !tn1Var.w()) {
                tn1Var.Q();
                return 2;
            }
        } else {
            boolean z = false;
            if (!x44.r(intent != null ? intent.getAction() : null, "com.anthropic.claude.bell.STOP")) {
                if (this.O == 0) {
                    this.O = this.J.a();
                }
                List list = d7c.a;
                NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
                if (notificationManager != null) {
                    NotificationChannel notificationChannel = new NotificationChannel("voice_mode_notification_channel_v2", getString(R.string.notification_channel_voice_mode_name), 4);
                    notificationChannel.setShowBadge(false);
                    notificationChannel.setSound(null, null);
                    notificationChannel.enableVibration(false);
                    notificationManager.createNotificationChannel(notificationChannel);
                    notificationManager.deleteNotificationChannel("voice_mode_notification_channel");
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 31) {
                    try {
                        startForeground(500, a(true, false), 130);
                    } catch (ForegroundServiceStartNotAllowedException e) {
                        List list2 = xah.a;
                        Map mapSingletonMap = Collections.singletonMap("category", "bell");
                        mapSingletonMap.getClass();
                        xah.f(e, "BellModeService: startForeground() not allowed, app is in background. Stopping service.", ozfVar, mapSingletonMap, 16);
                        stopSelf();
                        return 2;
                    } catch (SecurityException e2) {
                        List list3 = xah.a;
                        Map mapSingletonMap2 = Collections.singletonMap("category", "bell");
                        mapSingletonMap2.getClass();
                        xah.f(e2, "BellModeService: startForeground() failed microphone FGS permission check. Stopping service.", ozfVar, mapSingletonMap2, 16);
                        stopSelf();
                        return 2;
                    }
                } else if (i3 >= 30) {
                    startForeground(500, a(true, true), 130);
                } else {
                    startForeground(500, a(true, true));
                }
                this.P = true;
                if (i3 >= 31) {
                    Notification notificationA = a(true, true);
                    try {
                        NotificationManager notificationManager2 = (NotificationManager) getSystemService(NotificationManager.class);
                        if (notificationManager2 != null) {
                            notificationManager2.notify(500, notificationA);
                        }
                    } catch (RuntimeException e3) {
                        List list4 = xah.a;
                        xah.f(e3, "BellModeService: CallStyle upgrade rejected after startForeground; kept plain notification.", ozfVar, sta.h0(new cpc("category", "bell"), new cpc("phase", "startup_upgrade")), 16);
                    }
                }
                MediaSession mediaSession = this.G;
                if (mediaSession != null) {
                    mediaSession.setActive(false);
                }
                MediaSession mediaSession2 = this.G;
                if (mediaSession2 != null) {
                    mediaSession2.release();
                }
                this.G = null;
                MediaSession mediaSession3 = new MediaSession(this, "BellModeVoice");
                mediaSession3.setCallback(new dm1(this));
                mediaSession3.setActive(true);
                g(mediaSession3);
                this.G = mediaSession3;
                return 2;
            }
            tn1 tn1Var2 = this.E;
            if (tn1Var2 != null && tn1Var2.l()) {
                z = true;
            }
            c();
            bz7 bz7Var = T;
            if (bz7Var != null) {
                bz7Var.invoke(Boolean.valueOf(z));
            }
        }
        return 2;
    }
}
