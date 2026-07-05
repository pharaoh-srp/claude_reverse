package defpackage;

import android.net.ConnectivityManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.anthropic.claude.api.account.GrowthBookExperiment;
import com.anthropic.claude.api.account.GrowthBookExperimentResult;
import com.anthropic.claude.api.account.GrowthBookFeature;
import com.anthropic.claude.api.events.EventLoggingRequest;
import com.anthropic.claude.api.events.ExperimentMetadata;
import com.anthropic.claude.api.events.GrowthBookExperimentEventData;
import com.anthropic.claude.api.events.GrowthBookFeatureEvaluationEventData;
import com.anthropic.claude.types.environment.AppEnvironment;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.Closeable;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final class bg7 implements DefaultLifecycleObserver, k4i, Closeable {
    public final bg9 E;
    public final uz6 F;
    public final String G;
    public final String H;
    public final String I;
    public final boolean J;
    public final AppEnvironment K;
    public final c4a L;
    public final ConnectivityManager M;
    public final xp3 N;
    public final l45 O;
    public final zy7 P;
    public final h1e Q;
    public final jz6 R;
    public final ev6 S;
    public final fkg T;

    public bg7(File file, bg9 bg9Var, uz6 uz6Var, h86 h86Var, String str, String str2, String str3, boolean z, AppEnvironment appEnvironment, c4a c4aVar, ConnectivityManager connectivityManager, l45 l45Var, zy7 zy7Var) {
        k2e k2eVar = k2e.F;
        h86.a.getClass();
        ft5 ft5Var = g86.a;
        vr5 vr5Var = vr5.G;
        g1e g1eVar = h1e.E;
        str2.getClass();
        c4aVar.getClass();
        vr5Var.getClass();
        this.E = bg9Var;
        this.F = uz6Var;
        this.G = str;
        this.H = str2;
        this.I = str3;
        this.J = z;
        this.K = appEnvironment;
        this.L = c4aVar;
        this.M = connectivityManager;
        this.N = k2eVar;
        this.O = l45Var;
        this.P = zy7Var;
        this.Q = g1eVar;
        z35 z35Var = new z35(20);
        int i = 0;
        jz6 jz6Var = new jz6(file, "exposures", EventLoggingRequest.Companion.serializer(), bg9Var, new xf7(i, z35Var), vr5Var, k2eVar);
        this.R = jz6Var;
        int i2 = 0;
        this.S = new ev6(jz6Var, new wv2(2, this, bg7.class, "uploadExposures", "uploadExposures(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i2, 2), "FeatureExposureTracker", l45Var, h86Var, new xf7(i, z35Var), new dm(0, this, bg7.class, "isNetworkAvailable", "isNetworkAvailable()Z", i2, 10));
        this.T = gb9.D(l45Var, h86Var.a(), null, new fj(this, null, 7), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
    
        if (r14 == r13) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c3, code lost:
    
        if (r14 == r13) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.bg7 r12, java.util.List r13, defpackage.tp4 r14) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bg7.f(bg7, java.util.List, tp4):java.lang.Object");
    }

    @Override // defpackage.k4i
    public final void c(String str, GrowthBookFeature growthBookFeature, JsonObject jsonObject) throws NoSuchAlgorithmException {
        str.getClass();
        String strI = vb7.i();
        xp3 xp3Var = this.N;
        c69 c69VarC = xp3Var.c();
        String string = growthBookFeature.getDefaultValue().toString();
        string.getClass();
        if (string.length() > 32) {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = string.getBytes(dj2.a);
            bytes.getClass();
            byte[] bArrDigest = messageDigest.digest(bytes);
            bArrDigest.getClass();
            string = ij0.j("\"sha256:", bsg.j1(16, mp0.L0(bArrDigest, "", new a6f(26), 30)), "\"");
        }
        zf7 zf7Var = new zf7(this, new EventLoggingRequest.FeatureEvaluation(new GrowthBookFeatureEvaluationEventData(strI, c69VarC, str, string, growthBookFeature.getSource(), this.G, this.K, (String) null, growthBookFeature.getRuleId(), jsonObject != null ? jsonObject.toString() : null, FreeTypeConstants.FT_LOAD_PEDANTIC, (mq5) null)), null);
        l45 l45Var = this.O;
        gb9.D(l45Var, null, null, zf7Var, 3);
        GrowthBookExperiment experiment = growthBookFeature.getExperiment();
        GrowthBookExperimentResult experimentResult = growthBookFeature.getExperimentResult();
        Integer variationId = experimentResult != null ? experimentResult.getVariationId() : null;
        if (experiment == null || variationId == null) {
            return;
        }
        gb9.D(l45Var, null, null, new yf7(this, new EventLoggingRequest.ExperimentExposure(new GrowthBookExperimentEventData(vb7.i(), xp3Var.c(), experiment.getKey(), variationId.intValue(), this.K, this.E.d(new ExperimentMetadata(str), ExperimentMetadata.Companion.serializer()), this.G, this.H, jsonObject != null ? jsonObject.toString() : null)), null), 3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.T.d(null);
        ev6 ev6Var = this.S;
        lf9 lf9Var = ev6Var.j;
        if (lf9Var != null) {
            lf9Var.d(null);
        }
        ev6Var.j = null;
        this.R.d();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(m4a m4aVar) {
        m4aVar.getClass();
        this.S.b();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(m4a m4aVar) {
        m4aVar.getClass();
        gb9.D(this.O, null, null, new cj(this, null, 22), 3);
        ev6 ev6Var = this.S;
        lf9 lf9Var = ev6Var.j;
        if (lf9Var != null) {
            lf9Var.d(null);
        }
        ev6Var.j = null;
    }
}
