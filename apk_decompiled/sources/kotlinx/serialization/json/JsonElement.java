package kotlinx.serialization.json;

import defpackage.eh9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\bD¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/json/JsonElement;", "", "<init>", "()V", "Companion", "Lkotlinx/serialization/json/JsonArray;", "Lkotlinx/serialization/json/JsonObject;", "Lkotlinx/serialization/json/JsonPrimitive;", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = mdj.f)
@onf(with = eh9.class)
public abstract class JsonElement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/json/JsonElement$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonElement;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = mdj.f)
    public static final class Companion {
        public final KSerializer serializer() {
            return eh9.a;
        }
    }

    public /* synthetic */ JsonElement(mq5 mq5Var) {
        this();
    }

    private JsonElement() {
    }
}
