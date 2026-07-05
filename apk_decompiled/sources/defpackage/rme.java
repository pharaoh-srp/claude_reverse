package defpackage;

import com.anthropic.claude.api.usage.ExtraUsageResponse;
import com.anthropic.claude.core.telemetry.SilentException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class rme implements KSerializer {
    public static final rme a = new rme();
    public static final KSerializer b;
    public static final SerialDescriptor c;

    static {
        KSerializer kSerializerSerializer = ExtraUsageResponse.Companion.serializer();
        b = kSerializerSerializer;
        SerialDescriptor descriptor = kSerializerSerializer.getDescriptor();
        descriptor.getClass();
        if (!descriptor.c()) {
            descriptor = new inf(descriptor);
        }
        c = descriptor;
    }

    public static void a(IllegalArgumentException illegalArgumentException) {
        List list = xah.a;
        SilentException silentException = new SilentException("Resilient decode: extra_usage malformed; decoded as null", illegalArgumentException);
        Map mapSingletonMap = Collections.singletonMap("error_class", jce.a.b(illegalArgumentException.getClass()).f());
        mapSingletonMap.getClass();
        xah.f(silentException, null, ozf.F, mapSingletonMap, 18);
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        zg9 zg9Var = decoder instanceof zg9 ? (zg9) decoder : null;
        KSerializer kSerializer = b;
        if (zg9Var == null) {
            return (ExtraUsageResponse) decoder.g(kSerializer);
        }
        JsonElement jsonElementN = zg9Var.n();
        if (!(jsonElementN instanceof JsonNull)) {
            try {
                return (ExtraUsageResponse) zg9Var.d().a(kSerializer, jsonElementN);
            } catch (SerializationException e) {
                a(e);
            } catch (IllegalArgumentException e2) {
                a(e2);
            }
        }
        return null;
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ExtraUsageResponse extraUsageResponse = (ExtraUsageResponse) obj;
        encoder.getClass();
        if (extraUsageResponse == null) {
            encoder.e();
        } else {
            encoder.h(extraUsageResponse, b);
        }
    }
}
