package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class o2d implements Externalizable {
    public boolean E;
    public boolean I;
    public String F = "";
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public String J = "";

    public final int a() {
        return ((Integer) this.G.get(0)).intValue();
    }

    public final int b() {
        return this.G.size();
    }

    public final ArrayList c() {
        return this.G;
    }

    public final ArrayList d() {
        return this.H;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.E = true;
            this.F = utf;
        }
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.G.add(Integer.valueOf(objectInput.readInt()));
        }
        int i3 = objectInput.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            this.H.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.I = true;
            this.J = utf2;
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.E);
        if (this.E) {
            objectOutput.writeUTF(this.F);
        }
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeInt(((Integer) arrayList.get(i)).intValue());
        }
        ArrayList arrayList2 = this.H;
        int size2 = arrayList2.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            objectOutput.writeInt(((Integer) arrayList2.get(i2)).intValue());
        }
        objectOutput.writeBoolean(this.I);
        if (this.I) {
            objectOutput.writeUTF(this.J);
        }
    }
}
