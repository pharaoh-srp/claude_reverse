package defpackage;

import com.anthropic.claude.types.strings.ChatId;
import java.util.UUID;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class ws2 {
    public static String a() {
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        String string = uuidRandomUUID.toString();
        string.getClass();
        return ChatId.m979constructorimpl(string);
    }

    public final KSerializer serializer() {
        return vs2.a;
    }
}
