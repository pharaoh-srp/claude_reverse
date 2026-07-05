package defpackage;

import anthropic.claude.usercontent.UnknownMessage;
import com.squareup.moshi.JsonDataException;
import com.squareup.wire.AnyMessage;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class be0 extends gg9 {
    public final gg9 a;

    public be0(gg9 gg9Var) {
        this.a = gg9Var;
    }

    @Override // defpackage.gg9
    public final Object fromJson(ci9 ci9Var) throws IOException {
        AnyMessage anyMessagePack;
        ci9Var.getClass();
        ci9 ci9VarN = ci9Var.n();
        try {
            try {
                anyMessagePack = (AnyMessage) this.a.fromJson(ci9Var);
            } catch (JsonDataException unused) {
                ci9Var.skipValue();
                AnyMessage.Companion companion = AnyMessage.INSTANCE;
                String strNextString = "";
                if (ci9VarN.j() == bi9.G) {
                    ci9VarN.beginObject();
                    while (true) {
                        if (!ci9VarN.hasNext()) {
                            break;
                        }
                        if (x44.r(ci9VarN.nextName(), "@type")) {
                            strNextString = ci9VarN.nextString();
                            strNextString.getClass();
                            break;
                        }
                        ci9VarN.skipValue();
                    }
                }
                anyMessagePack = companion.pack(new UnknownMessage(strNextString, null, 2, null));
            }
            return anyMessagePack;
        } finally {
            ci9VarN.close();
        }
    }

    @Override // defpackage.gg9
    public final void toJson(jj9 jj9Var, Object obj) {
        jj9Var.getClass();
        this.a.toJson(jj9Var, (AnyMessage) obj);
    }
}
