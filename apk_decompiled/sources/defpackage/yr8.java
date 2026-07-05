package defpackage;

import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.types.strings.ChatId;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class yr8 implements zy7 {
    public final /* synthetic */ int E;
    public final Object F;
    public final /* synthetic */ Object G;

    public yr8(zr8 zr8Var, cs8 cs8Var) {
        this.E = 0;
        this.G = zr8Var;
        this.F = cs8Var;
    }

    @Override // defpackage.zy7
    public final Object a() throws Throwable {
        Throwable th;
        xr6 xr6Var;
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj = this.G;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                zr8 zr8Var = (zr8) obj;
                cs8 cs8Var = (cs8) obj2;
                xr6 xr6Var2 = xr6.INTERNAL_ERROR;
                IOException iOException = null;
                try {
                    try {
                    } catch (IOException e) {
                        iOException = e;
                    }
                    if (!cs8Var.c(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    do {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } while (cs8Var.c(false, this));
                    xr6Var = xr6.NO_ERROR;
                    try {
                        try {
                            zr8Var.c(xr6Var, xr6.CANCEL, null);
                        } catch (IOException e2) {
                            iOException = e2;
                            xr6 xr6Var3 = xr6.PROTOCOL_ERROR;
                            zr8Var.c(xr6Var3, xr6Var3, iOException);
                        }
                        zkj.b(cs8Var);
                        return ieiVar;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                xr6Var = xr6Var2;
                zr8Var.c(xr6Var, xr6Var2, iOException);
                zkj.b(cs8Var);
                throw th;
            case 1:
                ChatConversationWithProjectReference chatConversationWithProjectReference = (ChatConversationWithProjectReference) obj;
                ((pz7) obj2).invoke(ChatId.m978boximpl(chatConversationWithProjectReference.m209getUuidRjYBDck()), chatConversationWithProjectReference.getName());
                return ieiVar;
            default:
                ((bz7) obj2).invoke((ChatConversationWithProjectReference) obj);
                return ieiVar;
        }
    }

    public /* synthetic */ yr8(qz7 qz7Var, ChatConversationWithProjectReference chatConversationWithProjectReference, int i) {
        this.E = i;
        this.F = qz7Var;
        this.G = chatConversationWithProjectReference;
    }
}
