package defpackage;

import com.anthropic.claude.db.ClaudeDatabase;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k91 implements zy7 {
    public static final k91 F = new k91(0);
    public static final k91 G = new k91(1);
    public static final k91 H = new k91(2);
    public static final k91 I = new k91(3);
    public static final k91 J = new k91(4);
    public final /* synthetic */ int E;

    public /* synthetic */ k91(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return new d54(d4c.m(1308617531));
            case 1:
                return (cve) xn5.b0(ClaudeDatabase.class);
            case 2:
                return new d54(d54.b);
            case 3:
                return null;
            default:
                return new LinkedHashMap();
        }
    }
}
