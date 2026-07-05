package com.anthropic.claude.bell.tts;

import android.content.IntentFilter;
import android.media.AudioTrack;
import android.net.Uri;
import com.anthropic.claude.bell.PlaybackPace;
import com.anthropic.claude.bell.api.VoiceSelection;
import com.anthropic.claude.bell.tts.TTSApiMessage;
import defpackage.blj;
import defpackage.bsg;
import defpackage.bz7;
import defpackage.d2h;
import defpackage.d6d;
import defpackage.gb9;
import defpackage.gdc;
import defpackage.hdc;
import defpackage.i2h;
import defpackage.iei;
import defpackage.jie;
import defpackage.jxb;
import defpackage.k6d;
import defpackage.kie;
import defpackage.l45;
import defpackage.lz1;
import defpackage.m45;
import defpackage.o2h;
import defpackage.p5e;
import defpackage.pz7;
import defpackage.sf5;
import defpackage.sz6;
import defpackage.tp4;
import defpackage.u3e;
import defpackage.uh6;
import defpackage.um1;
import defpackage.v40;
import defpackage.xzg;
import defpackage.z4j;
import defpackage.zh6;
import defpackage.zo;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends xzg implements pz7 {
    public AudioTrack E;
    public jxb F;
    public f G;
    public i2h H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ f K;
    public final /* synthetic */ List L;
    public final /* synthetic */ i2h M;
    public final /* synthetic */ d6d N;
    public final /* synthetic */ bz7 O;
    public final /* synthetic */ o2h P;
    public final /* synthetic */ u3e Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, List list, i2h i2hVar, d6d d6dVar, bz7 bz7Var, o2h o2hVar, u3e u3eVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.K = fVar;
        this.L = list;
        this.M = i2hVar;
        this.N = d6dVar;
        this.O = bz7Var;
        this.P = o2hVar;
        this.Q = u3eVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        e eVar = new e(this.K, this.L, this.M, this.N, this.O, this.P, this.Q, tp4Var);
        eVar.J = obj;
        return eVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws AudioPlaybackException {
        AudioTrack audioTrack;
        f fVar;
        jxb jxbVar;
        i2h i2hVar;
        l45 l45Var = (l45) this.J;
        m45 m45Var = m45.E;
        int i = this.I;
        try {
            if (i == 0) {
                sf5.h0(obj);
                f fVar2 = this.K;
                if (!fVar2.v) {
                    fVar2.a.registerReceiver(fVar2.u, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                    fVar2.v = true;
                }
                audioTrack = (AudioTrack) this.K.g.a();
                fVar = this.K;
                jxbVar = fVar.l;
                i2h i2hVar2 = this.M;
                this.J = l45Var;
                this.E = audioTrack;
                this.F = jxbVar;
                this.G = fVar;
                this.H = i2hVar2;
                this.I = 1;
                if (jxbVar.c(this) == m45Var) {
                    return m45Var;
                }
                i2hVar = i2hVar2;
            } else {
                if (i != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2hVar = this.H;
                fVar = this.G;
                jxbVar = this.F;
                audioTrack = this.E;
                sf5.h0(obj);
            }
            try {
                fVar.m = audioTrack;
                fVar.p = i2hVar;
                audioTrack.play();
                jxbVar.d(null);
                d2h d2hVar = this.K.b;
                d dVar = new d(d2hVar.c, d2hVar.d);
                gdc gdcVarB = ((hdc) d2hVar.a.a()).b();
                lz1 lz1Var = uh6.F;
                gdcVarB.c(0L);
                gdcVarB.A = blj.c(v40.Q(30, zh6.SECONDS));
                hdc hdcVar = new hdc(gdcVarB);
                z4j z4jVar = VoiceSelection.Companion;
                um1 um1Var = d2hVar.e;
                String strB = um1Var.b();
                z4jVar.getClass();
                String strA = z4j.a(strB);
                k6d k6dVar = PlaybackPace.Companion;
                String strA2 = um1Var.a();
                k6dVar.getClass();
                float speedFactor = k6d.a(strA2).getSpeedFactor();
                String str = d2hVar.b;
                strA.getClass();
                Uri.Builder builderBuildUpon = Uri.parse(str.concat("ws/text_to_speech/text_stream")).buildUpon();
                builderBuildUpon.appendQueryParameter("voice", strA);
                builderBuildUpon.appendQueryParameter("tts_speed", String.valueOf(speedFactor));
                Uri uriBuild = builderBuildUpon.build();
                uriBuild.getClass();
                String string = uriBuild.toString();
                string.getClass();
                jie jieVar = new jie();
                jieVar.g(string);
                dVar.e = hdcVar.c(new kie(jieVar), dVar);
                f fVar3 = this.K;
                i2h i2hVar3 = this.M;
                fVar3.j = dVar;
                i2hVar3.e = dVar;
                gb9.D(l45Var, this.K.c.b(), null, new zo(this.K, this.N, this.O, this.M, dVar, this.P, this.Q, (tp4) null), 2);
                for (String str2 : this.L) {
                    if (!bsg.I0(str2)) {
                        ((p5e) dVar.v()).i(dVar.d.d(new TTSApiMessage.TextChunkInputMessage(str2, "text_chunk"), TTSApiMessage.TextChunkInputMessage.Companion.serializer()));
                    }
                }
                ((p5e) dVar.v()).i("{ \"type\": \"close_stream\" }");
                dVar.b = true;
                return iei.a;
            } catch (Throwable th) {
                jxbVar.d(null);
                throw th;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            throw new AudioPlaybackException(e2, false);
        }
    }
}
