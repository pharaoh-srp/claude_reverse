package defpackage;

import com.anthropic.claude.api.common.PixelSize;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class a3d {
    public static PixelSize a(Integer num, Integer num2) {
        if (num == null || num2 == null) {
            return null;
        }
        return new PixelSize(num.intValue(), num2.intValue());
    }

    public final KSerializer serializer() {
        return z2d.a;
    }
}
