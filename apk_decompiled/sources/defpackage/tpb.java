package defpackage;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.api.model.ModelSelectorSurface;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tpb implements w28 {
    public static final tpb a;
    private static final SerialDescriptor descriptor;

    static {
        tpb tpbVar = new tpb();
        a = tpbVar;
        x29 x29Var = new x29("com.anthropic.claude.api.model.ModelSelectorSurface", tpbVar);
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
        return ModelSelectorSurface.m372boximpl(ModelSelectorSurface.m373constructorimpl(decoder.y(descriptor).s()));
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        String strM378unboximpl = ((ModelSelectorSurface) obj).m378unboximpl();
        encoder.getClass();
        strM378unboximpl.getClass();
        Encoder encoderX = encoder.x(descriptor);
        if (encoderX == null) {
            return;
        }
        encoderX.F(strM378unboximpl);
    }
}
