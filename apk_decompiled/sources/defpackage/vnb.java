package defpackage;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.types.strings.ModelId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vnb implements w28 {
    public static final vnb a;
    private static final SerialDescriptor descriptor;

    static {
        vnb vnbVar = new vnb();
        a = vnbVar;
        x29 x29Var = new x29("com.anthropic.claude.types.strings.ModelId", vnbVar);
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
        return ModelId.m1058boximpl(ModelId.m1059constructorimpl(decoder.y(descriptor).s()));
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        String strM1064unboximpl = ((ModelId) obj).m1064unboximpl();
        encoder.getClass();
        strM1064unboximpl.getClass();
        Encoder encoderX = encoder.x(descriptor);
        if (encoderX == null) {
            return;
        }
        encoderX.F(strM1064unboximpl);
    }
}
