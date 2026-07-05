package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l35 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Map d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final List h;
    public final List i;
    public final Double j;
    public final c4f k;
    public final /* synthetic */ o35 l;

    public l35(o35 o35Var, ji6 ji6Var, l35 l35Var) {
        this.l = o35Var;
        this.a = ji6Var.a;
        this.b = ji6Var.b;
        this.c = ji6Var.c;
        Map map = ji6Var.d;
        this.d = map == null ? Collections.EMPTY_MAP : map;
        Map map2 = ji6Var.e;
        this.e = map2 == null ? Collections.EMPTY_MAP : map2;
        Map map3 = ji6Var.f;
        this.f = map3 == null ? Collections.EMPTY_MAP : map3;
        Map map4 = ji6Var.g;
        this.g = map4 == null ? Collections.EMPTY_MAP : map4;
        Double d = ji6Var.j;
        this.j = d;
        this.h = ji6Var.h;
        this.i = ji6Var.i;
        if (l35Var == null) {
            this.k = o35Var.O;
        } else if (Objects.equals(d, l35Var.j)) {
            this.k = l35Var.k;
        } else {
            this.k = fd9.V(o35Var.R, this);
        }
    }

    public final String toString() {
        return "DynamicConfig{debugEnabled=false, runtimeMetricsEnabled=" + this.a + ", logsInjectionEnabled=" + this.b + ", dataStreamsEnabled=" + this.c + ", serviceMapping=" + this.d + ", requestHeaderTags=" + this.e + ", responseHeaderTags=" + this.f + ", baggageMapping=" + this.g + ", spanSamplingRules=" + this.h + ", traceSamplingRules=" + this.i + ", traceSampleRate=" + this.j + '}';
    }
}
