package anthropic.claude.usercontent.sandbox;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.jce;
import defpackage.kgh;
import defpackage.lm6;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ms6;
import defpackage.pl9;
import defpackage.w44;
import defpackage.x44;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B1\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u0016\u001a\u00020\u0002H\u0017b\u0018\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\n\b\u001a\u0012\u0006\b\n0\u001b8\u001cJ\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0082\u0004J\n\u0010!\u001a\u00020\"H\u0096\u0080\u0004J\b\u0010#\u001a\u00020\u0005H\u0016J0\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bRK\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u0092\u0002,\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\n\b\u0011\u0012\u0006\b\n0\u00128\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fRK\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u0092\u0002,\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0004\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\n\b\u0011\u0012\u0006\b\n0\u00128\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\f¨\u0006&"}, d2 = {"Lanthropic/claude/usercontent/sandbox/UnsupportedImportsError;", "Lcom/squareup/wire/Message;", "", "unsupported_modules", "", "", "non_existent_icons", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getUnsupported_modules", "()Ljava/util/List;", "Lcom/squareup/wire/WireField;", "tag", "adapter", "com.squareup.wire.ProtoAdapter#STRING", "label", "Lcom/squareup/wire/WireField$Label;", "REPEATED", "schemaIndex", "getNon_existent_icons", "newBuilder", "Lkotlin/Deprecated;", "message", "Shouldn't be used in Kotlin", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class UnsupportedImportsError extends Message {
    public static final ProtoAdapter<UnsupportedImportsError> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<String> non_existent_icons;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<String> unsupported_modules;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final pl9 pl9VarB = jce.a.b(UnsupportedImportsError.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UnsupportedImportsError>(fieldEncoding, pl9VarB, syntax) { // from class: anthropic.claude.usercontent.sandbox.UnsupportedImportsError$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UnsupportedImportsError decode(ProtoReader reader) {
                reader.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UnsupportedImportsError(arrayList, arrayList2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag != 2) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        arrayList2.add(ProtoAdapter.STRING.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UnsupportedImportsError value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 1, value.getUnsupported_modules());
                protoAdapter.asRepeated().encodeWithTag(writer, 2, value.getNon_existent_icons());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UnsupportedImportsError value) {
                value.getClass();
                int iE = value.unknownFields().e();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return protoAdapter.asRepeated().encodedSizeWithTag(2, value.getNon_existent_icons()) + protoAdapter.asRepeated().encodedSizeWithTag(1, value.getUnsupported_modules()) + iE;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UnsupportedImportsError redact(UnsupportedImportsError value) {
                value.getClass();
                return UnsupportedImportsError.copy$default(value, null, null, ByteString.H, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UnsupportedImportsError value) throws EOFException {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, value.getNon_existent_icons());
                protoAdapter.asRepeated().encodeWithTag(writer, 1, value.getUnsupported_modules());
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedImportsError(List<String> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        list2.getClass();
        byteString.getClass();
        this.unsupported_modules = Internal.immutableCopyOf("unsupported_modules", list);
        this.non_existent_icons = Internal.immutableCopyOf("non_existent_icons", list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnsupportedImportsError copy$default(UnsupportedImportsError unsupportedImportsError, List list, List list2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = unsupportedImportsError.unsupported_modules;
        }
        if ((i & 2) != 0) {
            list2 = unsupportedImportsError.non_existent_icons;
        }
        if ((i & 4) != 0) {
            byteString = unsupportedImportsError.unknownFields();
        }
        return unsupportedImportsError.copy(list, list2, byteString);
    }

    public final UnsupportedImportsError copy(List<String> unsupported_modules, List<String> non_existent_icons, ByteString unknownFields) {
        unsupported_modules.getClass();
        non_existent_icons.getClass();
        unknownFields.getClass();
        return new UnsupportedImportsError(unsupported_modules, non_existent_icons, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UnsupportedImportsError)) {
            return false;
        }
        UnsupportedImportsError unsupportedImportsError = (UnsupportedImportsError) other;
        return x44.r(unknownFields(), unsupportedImportsError.unknownFields()) && x44.r(this.unsupported_modules, unsupportedImportsError.unsupported_modules) && x44.r(this.non_existent_icons, unsupportedImportsError.non_existent_icons);
    }

    public final List<String> getNon_existent_icons() {
        return this.non_existent_icons;
    }

    public final List<String> getUnsupported_modules() {
        return this.unsupported_modules;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.non_existent_icons.hashCode() + kgh.m(unknownFields().hashCode() * 37, 37, this.unsupported_modules);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @lz5
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m90newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.unsupported_modules.isEmpty()) {
            ms6.y("unsupported_modules=", Internal.sanitize(this.unsupported_modules), arrayList);
        }
        if (!this.non_existent_icons.isEmpty()) {
            ms6.y("non_existent_icons=", Internal.sanitize(this.non_existent_icons), arrayList);
        }
        return w44.S0(arrayList, ", ", "UnsupportedImportsError{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    @lz5
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m90newBuilder();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UnsupportedImportsError(List list, List list2, ByteString byteString, int i, mq5 mq5Var) {
        int i2 = i & 1;
        lm6 lm6Var = lm6.E;
        this(i2 != 0 ? lm6Var : list, (i & 2) != 0 ? lm6Var : list2, (i & 4) != 0 ? ByteString.H : byteString);
    }

    public UnsupportedImportsError() {
        this(null, null, null, 7, null);
    }
}
