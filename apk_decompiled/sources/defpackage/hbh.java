package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class hbh {
    public final bm4 a;
    public final long b;
    public final int c;
    public final String d;
    public final zah e;
    public final dbh f;
    public final gbh g;
    public final yah h;
    public final Float i;
    public final fbh j;

    public hbh(bm4 bm4Var, long j, int i, String str, zah zahVar, dbh dbhVar, gbh gbhVar, yah yahVar, Float f, fbh fbhVar) {
        if (i == 0) {
            throw null;
        }
        str.getClass();
        this.a = bm4Var;
        this.b = j;
        this.c = i;
        this.d = str;
        this.e = zahVar;
        this.f = dbhVar;
        this.g = gbhVar;
        this.h = yahVar;
        this.i = f;
        this.j = fbhVar;
    }

    public final qh9 a() {
        String str;
        qh9 qh9Var = new qh9();
        qh9 qh9Var2 = new qh9();
        qh9Var2.p(2L, "format_version");
        qh9Var.o("_dd", qh9Var2);
        qh9Var.r("type", "telemetry");
        qh9Var.p(Long.valueOf(this.b), "date");
        qh9Var.r("service", "dd-sdk-android");
        qh9Var.o("source", new vh9(ebh.b(this.c)));
        qh9Var.r("version", this.d);
        qh9 qh9Var3 = new qh9();
        qh9Var3.r("id", this.e.a);
        qh9Var.o("application", qh9Var3);
        qh9 qh9Var4 = new qh9();
        qh9Var4.r("id", this.f.a);
        qh9Var.o("session", qh9Var4);
        gbh gbhVar = this.g;
        if (gbhVar != null) {
            qh9 qh9Var5 = new qh9();
            qh9Var5.r("id", gbhVar.a);
            qh9Var.o("view", qh9Var5);
        }
        yah yahVar = this.h;
        if (yahVar != null) {
            qh9 qh9Var6 = new qh9();
            qh9Var6.r("id", yahVar.a);
            qh9Var.o("action", qh9Var6);
        }
        qh9Var.p(this.i, "effective_sample_rate");
        qh9 qh9Var7 = new qh9();
        fbh fbhVar = this.j;
        bbh bbhVar = fbhVar.a;
        if (bbhVar != null) {
            qh9 qh9Var8 = new qh9();
            String str2 = bbhVar.a;
            if (str2 != null) {
                qh9Var8.r("architecture", str2);
            }
            String str3 = bbhVar.b;
            if (str3 != null) {
                qh9Var8.r("brand", str3);
            }
            String str4 = bbhVar.c;
            if (str4 != null) {
                qh9Var8.r("model", str4);
            }
            qh9Var8.p(bbhVar.d, "logical_cpu_count");
            Number number = bbhVar.e;
            if (number != null) {
                qh9Var8.p(number, "total_ram");
            }
            Boolean bool = bbhVar.f;
            if (bool != null) {
                qh9Var8.q("is_low_ram", bool);
            }
            qh9Var7.o("device", qh9Var8);
        }
        cbh cbhVar = fbhVar.b;
        if (cbhVar != null) {
            qh9 qh9Var9 = new qh9();
            String str5 = cbhVar.a;
            if (str5 != null) {
                qh9Var9.r("build", str5);
            }
            String str6 = cbhVar.b;
            if (str6 != null) {
                qh9Var9.r("name", str6);
            }
            String str7 = cbhVar.c;
            if (str7 != null) {
                qh9Var9.r("version", str7);
            }
            qh9Var7.o("os", qh9Var9);
        }
        qh9Var7.r("type", fbhVar.e);
        abh abhVar = fbhVar.c;
        abhVar.getClass();
        qh9 qh9Var10 = new qh9();
        Long l = abhVar.a;
        if (l != null) {
            grc.A(l, qh9Var10, "session_sample_rate");
        }
        Long l2 = abhVar.b;
        if (l2 != null) {
            grc.A(l2, qh9Var10, "telemetry_sample_rate");
        }
        Long l3 = abhVar.c;
        if (l3 != null) {
            grc.A(l3, qh9Var10, "trace_sample_rate");
        }
        Long l4 = abhVar.d;
        if (l4 != null) {
            grc.A(l4, qh9Var10, "session_replay_sample_rate");
        }
        Boolean bool2 = abhVar.e;
        if (bool2 != null) {
            qh9Var10.q("start_recording_immediately", bool2);
        }
        qh9Var10.q("use_proxy", abhVar.f);
        String str8 = abhVar.g;
        if (str8 != null) {
            qh9Var10.r("text_and_input_privacy_level", str8);
        }
        String str9 = abhVar.h;
        if (str9 != null) {
            qh9Var10.r("image_privacy_level", str9);
        }
        String str10 = abhVar.i;
        if (str10 != null) {
            qh9Var10.r("touch_privacy_level", str10);
        }
        Boolean bool3 = abhVar.j;
        if (bool3 != null) {
            qh9Var10.q("track_frustrations", bool3);
        }
        qh9Var10.q("track_interactions", abhVar.k);
        Long l5 = abhVar.l;
        if (l5 != null) {
            grc.A(l5, qh9Var10, "number_of_displays");
        }
        Boolean bool4 = Boolean.FALSE;
        qh9Var10.q("use_local_encryption", bool4);
        int i = abhVar.A;
        if (i != 0) {
            if (i == 1) {
                str = "ActivityViewTrackingStrategy";
            } else if (i == 2) {
                str = "FragmentViewTrackingStrategy";
            } else if (i == 3) {
                str = "MixedViewTrackingStrategy";
            } else {
                if (i != 4) {
                    throw null;
                }
                str = "NavigationViewTrackingStrategy";
            }
            qh9Var10.o("view_tracking_strategy", new vh9(str));
        }
        Boolean bool5 = abhVar.m;
        if (bool5 != null) {
            qh9Var10.q("track_background_events", bool5);
        }
        Long l6 = abhVar.n;
        if (l6 != null) {
            grc.A(l6, qh9Var10, "mobile_vitals_update_period");
        }
        qh9Var10.q("track_errors", abhVar.o);
        qh9Var10.q("track_network_requests", abhVar.p);
        qh9Var10.q("use_tracing", abhVar.q);
        qh9Var10.q("track_native_long_tasks", abhVar.r);
        grc.A(abhVar.s, qh9Var10, "batch_size");
        grc.A(abhVar.t, qh9Var10, "batch_upload_frequency");
        grc.A(abhVar.u, qh9Var10, "batch_processing_level");
        String str11 = abhVar.v;
        if (str11 != null) {
            qh9Var10.r("tracer_api", str11);
        }
        String str12 = abhVar.w;
        if (str12 != null) {
            qh9Var10.r("tracer_api_version", str12);
        }
        qh9Var10.q("is_main_process", abhVar.x);
        Long l7 = abhVar.y;
        if (l7 != null) {
            grc.A(l7, qh9Var10, "inv_time_threshold_ms");
        }
        Long l8 = abhVar.z;
        if (l8 != null) {
            grc.A(l8, qh9Var10, "tns_time_threshold_ms");
        }
        qh9Var10.q("track_anonymous_user", Boolean.TRUE);
        qh9Var10.q("use_allowed_tracking_origins", bool4);
        qh9Var7.o("configuration", qh9Var10);
        for (Map.Entry entry : fbhVar.d.entrySet()) {
            String str13 = (String) entry.getKey();
            Object value = entry.getValue();
            if (!mp0.o0(str13, fbh.f)) {
                qh9Var7.o(str13, vz8.M(value));
            }
        }
        qh9Var.o("telemetry", qh9Var7);
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hbh) {
            hbh hbhVar = (hbh) obj;
            if (this.a == hbhVar.a && this.b == hbhVar.b && this.c == hbhVar.c && x44.r(this.d, hbhVar.d) && this.e.equals(hbhVar.e) && this.f.equals(hbhVar.f) && x44.r(this.g, hbhVar.g) && x44.r(this.h, hbhVar.h) && this.i.equals(hbhVar.i) && this.j.equals(hbhVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iL = kgh.l(kgh.l(kgh.l(qy1.c(this.c, (((Long.hashCode(this.b) + (this.a.hashCode() * 31)) * 31) + 391076367) * 31, 31), 31, this.d), 31, this.e.a), 31, this.f.a);
        gbh gbhVar = this.g;
        int iHashCode = (iL + (gbhVar == null ? 0 : gbhVar.a.hashCode())) * 31;
        yah yahVar = this.h;
        int iHashCode2 = yahVar != null ? yahVar.a.hashCode() : 0;
        return this.j.hashCode() + ((this.i.hashCode() + ((iHashCode + iHashCode2) * 31)) * 961);
    }

    public final String toString() {
        return "TelemetryConfigurationEvent(dd=" + this.a + ", date=" + this.b + ", service=dd-sdk-android, source=" + ebh.D(this.c) + ", version=" + this.d + ", application=" + this.e + ", session=" + this.f + ", view=" + this.g + ", action=" + this.h + ", effectiveSampleRate=" + this.i + ", experimentalFeatures=null, telemetry=" + this.j + ")";
    }
}
