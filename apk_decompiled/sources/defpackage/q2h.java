package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.os.SystemClock;
import com.anthropic.claude.analytics.events.ReadAloudEvents$MobileReadAloudStarted;
import com.anthropic.claude.analytics.events.ReadAloudEvents$ReadAloudOutcome;
import com.anthropic.claude.bell.api.VoiceSelection;
import com.anthropic.claude.bell.tts.TTSPlaybackService;
import com.anthropic.claude.bell.tts.f;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class q2h extends xzg implements pz7 {
    public /* synthetic */ Object E;
    public final /* synthetic */ f F;
    public final /* synthetic */ dae G;
    public final /* synthetic */ String H;
    public final /* synthetic */ dae I;
    public final /* synthetic */ z9e J;
    public final /* synthetic */ List K;
    public final /* synthetic */ i2h L;
    public final /* synthetic */ bz7 M;
    public final /* synthetic */ cae N;
    public final /* synthetic */ dae O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2h(f fVar, dae daeVar, String str, dae daeVar2, z9e z9eVar, List list, i2h i2hVar, bz7 bz7Var, cae caeVar, dae daeVar3, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = fVar;
        this.G = daeVar;
        this.H = str;
        this.I = daeVar2;
        this.J = z9eVar;
        this.K = list;
        this.L = i2hVar;
        this.M = bz7Var;
        this.N = caeVar;
        this.O = daeVar3;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        q2h q2hVar = new q2h(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, tp4Var);
        q2hVar.E = obj;
        return q2hVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        q2h q2hVar = (q2h) create((l45) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        q2hVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        ozf ozfVar = ozf.F;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) this.E;
        sf5.h0(obj);
        f fVar = this.F;
        Set set = f.y;
        int i = 0;
        fVar.g(false);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.G.E = new Long(jElapsedRealtime);
        qi3 qi3Var = fVar.d;
        String str = this.H;
        z4j z4jVar = VoiceSelection.Companion;
        String strB = fVar.e.b();
        z4jVar.getClass();
        qi3Var.e(new ReadAloudEvents$MobileReadAloudStarted(str, z4j.a(strB)), ReadAloudEvents$MobileReadAloudStarted.Companion.serializer());
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build()).setOnAudioFocusChangeListener(fVar.t).build();
        if (fVar.q.requestAudioFocus(audioFocusRequestBuild) != 1) {
            this.I.E = ReadAloudEvents$ReadAloudOutcome.FOCUS_DENIED;
            List list = xah.a;
            IllegalStateException illegalStateException = new IllegalStateException("Audio focus request denied");
            Map mapSingletonMap = Collections.singletonMap("category", "tts");
            mapSingletonMap.getClass();
            xah.f(illegalStateException, "TTS audio focus denied", ozfVar, mapSingletonMap, 16);
            return ieiVar;
        }
        fVar.r = audioFocusRequestBuild;
        try {
            zy7 zy7Var = TTSPlaybackService.F;
            TTSPlaybackService.F = new g2h(i, fVar);
            Context context = fVar.a;
            context.getClass();
            context.startForegroundService(new Intent(context, (Class<?>) TTSPlaybackService.class));
        } catch (Exception e) {
            List list2 = xah.a;
            Map mapSingletonMap2 = Collections.singletonMap("category", "tts");
            mapSingletonMap2.getClass();
            xah.f(e, "Failed to start TTS foreground service", ozfVar, mapSingletonMap2, 16);
        }
        this.J.E = true;
        f fVar2 = this.F;
        amg amgVar = fVar2.i;
        fkg fkgVarD = gb9.D(l45Var, null, null, new p2h(fVar2, this.K, this.L, this.M, this.N, this.H, jElapsedRealtime, null), 3);
        this.O.E = fkgVarD;
        amgVar.getClass();
        amgVar.n(null, fkgVarD);
        return ieiVar;
    }
}
