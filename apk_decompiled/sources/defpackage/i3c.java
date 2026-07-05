package defpackage;

import android.net.Uri;
import com.anthropic.claude.sessions.types.PermissionMode;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i3c implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ u3c F;
    public final /* synthetic */ r4g G;

    public /* synthetic */ i3c(r4g r4gVar, u3c u3cVar) {
        this.E = 0;
        this.G = r4gVar;
        this.F = u3cVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        u3c u3cVar = this.F;
        iei ieiVar = iei.a;
        r4g r4gVar = this.G;
        switch (i) {
            case 0:
                List<Uri> list = (List) obj;
                list.getClass();
                for (Uri uri : list) {
                    uri.getClass();
                    u3c u3cVar2 = this.F;
                    kdg kdgVar = u3cVar2.m;
                    if (kdgVar.size() < amk.c(u3cVar2.b).getMax_per_message_upload_count()) {
                        UUID uuidRandomUUID = UUID.randomUUID();
                        uuidRandomUUID.getClass();
                        String lastPathSegment = uri.getLastPathSegment();
                        if (lastPathSegment == null) {
                            lastPathSegment = "file";
                        }
                        o32 o32Var = new o32(uuidRandomUUID, uri, lastPathSegment);
                        kdgVar.add(o32Var);
                        u3cVar2.n.put(uuidRandomUUID, gb9.D(u3cVar2.c, null, null, new mt4(u3cVar2, uri, o32Var, (tp4) null, 18), 3));
                    }
                }
                r4gVar.a();
                break;
            case 1:
                PermissionMode permissionMode = (PermissionMode) obj;
                permissionMode.getClass();
                u3cVar.h.setValue(permissionMode);
                u3cVar.i.setValue(Boolean.TRUE);
                r4gVar.a();
                break;
            default:
                String str = (String) obj;
                str.getClass();
                kdg kdgVar2 = u3cVar.j;
                if (!kdgVar2.isEmpty()) {
                    kdgVar2.set(0, lhf.a((lhf) kdgVar2.get(0), str));
                    u3cVar.f.g(str);
                }
                r4gVar.a();
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ i3c(u3c u3cVar, r4g r4gVar, int i) {
        this.E = i;
        this.F = u3cVar;
        this.G = r4gVar;
    }
}
