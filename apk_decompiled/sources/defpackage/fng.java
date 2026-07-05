package defpackage;

import com.anthropic.claude.sessions.types.r1;
import java.util.UUID;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class fng {
    public static final /* synthetic */ fng a = new fng();

    public static final String a(fng fngVar) {
        fngVar.getClass();
        String string = UUID.randomUUID().toString();
        string.getClass();
        return string;
    }

    public final KSerializer serializer() {
        return r1.c;
    }
}
