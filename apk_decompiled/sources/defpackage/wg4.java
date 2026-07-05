package defpackage;

import com.anthropic.claude.models.organization.configtypes.OctopusConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class wg4 extends iwe {
    public final dnh b;
    public final wlg c;

    public wg4(dnh dnhVar, rc8 rc8Var, h86 h86Var) {
        super(h86Var);
        this.b = dnhVar;
        this.c = rc8Var.f("android_octopus_config", OctopusConfig.Companion.serializer());
    }
}
