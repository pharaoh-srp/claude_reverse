package defpackage;

import com.anthropic.claude.types.strings.ToolUseId;
import java.util.UUID;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class d1i {
    public static String a() {
        return ToolUseId.m1158constructorimpl("toolu_" + UUID.randomUUID());
    }

    public final KSerializer serializer() {
        return c1i.a;
    }
}
