package google.protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.jce;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.pl9;
import defpackage.w44;
import defpackage.x44;
import java.io.EOFException;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u0007\u001a\u00020\u0002H\u0017b\u0018\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\b\u000b\u0012\u0006\b\n0\f8\rJ\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0018"}, d2 = {"Lgoogle/protobuf/Empty;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "Lkotlin/Deprecated;", "message", "Shouldn't be used in Kotlin", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class Empty extends Message {
    public static final ProtoAdapter<Empty> ADAPTER;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final pl9 pl9VarB = jce.a.b(Empty.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Empty>(fieldEncoding, pl9VarB, syntax) { // from class: google.protobuf.Empty$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Empty decode(ProtoReader reader) {
                reader.getClass();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Empty(reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    reader.readUnknownField(iNextTag);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Empty value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Empty value) {
                value.getClass();
                return value.unknownFields().e();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Empty redact(Empty value) {
                value.getClass();
                return value.copy(ByteString.H);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Empty value) throws EOFException {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
            }
        };
    }

    public /* synthetic */ Empty(ByteString byteString, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? ByteString.H : byteString);
    }

    public static /* synthetic */ Empty copy$default(Empty empty, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = empty.unknownFields();
        }
        return empty.copy(byteString);
    }

    public final Empty copy(ByteString unknownFields) {
        unknownFields.getClass();
        return new Empty(unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        return (other instanceof Empty) && x44.r(unknownFields(), ((Empty) other).unknownFields());
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @lz5
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m1180newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        return w44.S0(new ArrayList(), ", ", "Empty{", "}", null, 56);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0007¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lgoogle/protobuf/Empty$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lgoogle/protobuf/Empty;", "Lkotlin/jvm/JvmField;", "serialVersionUID", "", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final class Companion {
        public /* synthetic */ Companion(mq5 mq5Var) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.squareup.wire.Message
    @lz5
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m1180newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Empty() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Empty(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }
}
