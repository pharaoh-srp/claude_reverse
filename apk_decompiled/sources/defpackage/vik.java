package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class vik extends pqk {
    public static final Pair e0 = new Pair("", 0L);
    public SharedPreferences G;
    public final Object H;
    public SharedPreferences I;
    public ue7 J;
    public final kjk K;
    public final bm7 L;
    public String M;
    public boolean N;
    public long O;
    public final kjk P;
    public final fjk Q;
    public final bm7 R;
    public final dpf S;
    public final fjk T;
    public final kjk U;
    public final kjk V;
    public boolean W;
    public final fjk X;
    public final fjk Y;
    public final kjk Z;
    public final bm7 a0;
    public final bm7 b0;
    public final kjk c0;
    public final dpf d0;

    public vik(umk umkVar) {
        super(umkVar);
        this.H = new Object();
        this.P = new kjk(this, "session_timeout", 1800000L);
        this.Q = new fjk(this, "start_new_session", true);
        this.U = new kjk(this, "last_pause_time", 0L);
        this.V = new kjk(this, "session_id", 0L);
        this.R = new bm7(this, "non_personalized_ads");
        this.S = new dpf(this, "last_received_uri_timestamps_by_source");
        this.T = new fjk(this, "allow_remote_dynamite", false);
        this.K = new kjk(this, "first_open_time", 0L);
        dgj.s("app_install_time");
        this.L = new bm7(this, "app_instance_id");
        this.X = new fjk(this, "app_backgrounded", false);
        this.Y = new fjk(this, "deep_link_retrieval_complete", false);
        this.Z = new kjk(this, "deep_link_retrieval_attempts", 0L);
        this.a0 = new bm7(this, "firebase_feature_rollouts");
        this.b0 = new bm7(this, "deferred_attribution_cache");
        this.c0 = new kjk(this, "deferred_attribution_cache_timestamp", 0L);
        this.d0 = new dpf(this, "default_event_parameters");
    }

    @Override // defpackage.pqk
    public final boolean N0() {
        return true;
    }

    public final void O0(SparseArray sparseArray) {
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            iArr[i] = sparseArray.keyAt(i);
            jArr[i] = ((Long) sparseArray.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        this.S.X(bundle);
    }

    public final boolean P0(int i) {
        return qrk.h(i, T0().getInt("consent_source", 100));
    }

    public final boolean Q0(long j) {
        return j - this.P.a() > this.U.a();
    }

    public final void R0(boolean z) {
        K0();
        b0().R.c("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = T0().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    public final SharedPreferences S0() {
        K0();
        L0();
        if (this.I == null) {
            synchronized (this.H) {
                try {
                    if (this.I == null) {
                        String str = ((umk) this.E).E.getPackageName() + "_preferences";
                        b0().R.c("Default prefs file", str);
                        this.I = ((umk) this.E).E.getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.I;
    }

    public final SharedPreferences T0() {
        K0();
        L0();
        dgj.v(this.G);
        return this.G;
    }

    public final SparseArray U0() {
        Bundle bundleW = this.S.W();
        if (bundleW == null) {
            return new SparseArray();
        }
        int[] intArray = bundleW.getIntArray("uriSources");
        long[] longArray = bundleW.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            b0().J.b("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final qrk V0() {
        K0();
        return qrk.f(T0().getInt("consent_source", 100), T0().getString("consent_settings", "G1"));
    }
}
