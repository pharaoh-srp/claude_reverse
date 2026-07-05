package defpackage;

import com.anthropic.claude.api.chat.tool.ImageGalleryItemId;
import com.anthropic.claude.api.experience.ExperienceToggle;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jw8 implements w28 {
    public static final jw8 a;
    private static final SerialDescriptor descriptor;

    static {
        jw8 jw8Var = new jw8();
        a = jw8Var;
        x29 x29Var = new x29("com.anthropic.claude.api.chat.tool.ImageGalleryItemId", jw8Var);
        x29Var.j(ExperienceToggle.DEFAULT_PARAM_KEY, false);
        descriptor = x29Var;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return ImageGalleryItemId.m304boximpl(ImageGalleryItemId.m305constructorimpl(decoder.y(descriptor).s()));
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        String strM310unboximpl = ((ImageGalleryItemId) obj).m310unboximpl();
        encoder.getClass();
        strM310unboximpl.getClass();
        Encoder encoderX = encoder.x(descriptor);
        if (encoderX == null) {
            return;
        }
        encoderX.F(strM310unboximpl);
    }
}
