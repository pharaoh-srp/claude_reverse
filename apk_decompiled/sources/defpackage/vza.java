package defpackage;

import android.content.MutableContextWrapper;
import com.anthropic.claude.api.mcp.McpAppToolResult;
import com.anthropic.claude.mcpapps.transport.HostContext;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class vza {
    public final aya a;
    public final MutableContextWrapper b;
    public final mp4 c;
    public final lsc d;
    public final lsc e;
    public final lsc f;
    public final lsc g;
    public final lsc h;
    public final isc i;
    public long j;
    public long k;
    public boolean l;
    public final isc m;
    public final lsc n;
    public long o;
    public boolean p;
    public final isc q;
    public JsonObject r;
    public int s;
    public McpAppToolResult t;
    public HostContext u;

    public vza(aya ayaVar, MutableContextWrapper mutableContextWrapper, mp4 mp4Var) {
        this.a = ayaVar;
        this.b = mutableContextWrapper;
        this.c = mp4Var;
        Boolean bool = Boolean.FALSE;
        this.d = mpk.P(bool);
        this.e = mpk.P(bool);
        this.f = mpk.P(bool);
        this.g = mpk.P(bool);
        this.h = mpk.P(bool);
        this.i = new isc(0);
        this.m = new isc(0);
        this.n = mpk.P(bool);
        this.q = new isc(0);
    }

    public final boolean a() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }
}
