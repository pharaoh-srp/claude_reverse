package com.anthropic.claude.sessions.types;

import com.anthropic.claude.sessions.types.ApiUserMessageContent;
import defpackage.bg9;
import defpackage.d4c;
import defpackage.gh9;
import defpackage.j8;
import defpackage.kfd;
import defpackage.rfd;
import defpackage.sz6;
import defpackage.uo0;
import defpackage.v40;
import defpackage.wg6;
import defpackage.zg9;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements KSerializer {
    public static final e a = new e();
    public static final rfd b = j8.h("ApiUserMessageContent", kfd.t);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        zg9 zg9Var = decoder instanceof zg9 ? (zg9) decoder : null;
        if (zg9Var == null) {
            sz6.j("ApiUserMessageContent can only be deserialized with Json");
            return null;
        }
        JsonElement jsonElementN = zg9Var.n();
        if (jsonElementN instanceof JsonPrimitive) {
            return new ApiUserMessageContent.Text(((JsonPrimitive) jsonElementN).getContent());
        }
        if (jsonElementN instanceof JsonArray) {
            return new ApiUserMessageContent.Blocks((List) zg9Var.d().a(d4c.t(ContentBlock.Companion.serializer()), jsonElementN));
        }
        sz6.p("Unknown ApiUserMessageContent type");
        return null;
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ApiUserMessageContent apiUserMessageContent = (ApiUserMessageContent) obj;
        encoder.getClass();
        apiUserMessageContent.getClass();
        gh9 gh9Var = encoder instanceof gh9 ? (gh9) encoder : null;
        if (gh9Var == null) {
            sz6.j("ApiUserMessageContent can only be serialized with Json");
            return;
        }
        if (apiUserMessageContent instanceof ApiUserMessageContent.Text) {
            gh9Var.F(((ApiUserMessageContent.Text) apiUserMessageContent).getText());
            return;
        }
        if (!(apiUserMessageContent instanceof ApiUserMessageContent.Blocks)) {
            wg6.i();
            return;
        }
        bg9 bg9VarD = gh9Var.d();
        uo0 uo0VarT = d4c.t(ContentBlock.Companion.serializer());
        List<ContentBlock> blocks = ((ApiUserMessageContent.Blocks) apiUserMessageContent).getBlocks();
        bg9VarD.getClass();
        gh9Var.u(v40.S(bg9VarD, blocks, uo0VarT));
    }
}
