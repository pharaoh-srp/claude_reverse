package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.SoundPool;
import com.anthropic.claude.R;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class meg implements zn1 {
    public static volatile MediaPlayer l;
    public final Context a;
    public final l45 b;
    public final zy7 c;
    public final ConcurrentHashMap d;
    public final SoundPool e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final bi0 j;
    public final bi0 k;

    public meg(Context context, l45 l45Var, zy7 zy7Var) {
        l45Var.getClass();
        zy7Var.getClass();
        this.a = context;
        this.b = l45Var;
        this.c = zy7Var;
        this.d = new ConcurrentHashMap();
        SoundPool soundPoolBuild = new SoundPool.Builder().setMaxStreams(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(4).build()).build();
        soundPoolBuild.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: leg
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
                Object objPutIfAbsent;
                ConcurrentHashMap concurrentHashMap = this.a.d;
                Integer numValueOf = Integer.valueOf(i);
                Object objC = concurrentHashMap.get(numValueOf);
                if (objC == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, (objC = zni.c()))) != null) {
                    objC = objPutIfAbsent;
                }
                ((v84) objC).c0(iei.a);
            }
        });
        this.e = soundPoolBuild;
        this.f = i(R.raw.enter);
        this.g = i(R.raw.user_input_end);
        this.h = i(R.raw.reconnected);
        this.i = i(R.raw.disconnected);
        this.j = new bi0(this, i(R.raw.reconnecting));
        this.k = new bi0(this, i(R.raw.processing));
    }

    @Override // defpackage.zn1
    public final void a(boolean z) {
        this.k.P(z);
    }

    @Override // defpackage.zn1
    public final void b(boolean z) {
        this.j.P(false);
        this.k.P(false);
        trk.h(this.b, b6c.F, new nw0(z, this, (tp4) null, 9));
    }

    @Override // defpackage.zn1
    public final void c() {
        j(this.j.b);
    }

    @Override // defpackage.zn1
    public final void d(boolean z) {
        this.j.P(z);
    }

    @Override // defpackage.zn1
    public final void e() {
        j(this.f);
    }

    @Override // defpackage.zn1
    public final void f() {
        j(this.g);
    }

    @Override // defpackage.zn1
    public final void g() {
        j(this.i);
    }

    @Override // defpackage.zn1
    public final void h() {
        j(this.h);
    }

    public final int i(int i) {
        int iLoad = this.e.load(this.a, i, 1);
        Integer numValueOf = Integer.valueOf(iLoad);
        ConcurrentHashMap concurrentHashMap = this.d;
        if (concurrentHashMap.get(numValueOf) == null) {
            concurrentHashMap.putIfAbsent(numValueOf, zni.c());
        }
        return iLoad;
    }

    public final void j(int i) {
        gb9.D(this.b, null, null, new e41(this, i, null, 5), 3);
    }
}
