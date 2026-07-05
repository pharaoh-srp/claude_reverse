package defpackage;

import android.net.Uri;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class bdi extends wd1 {
    public final int I;
    public final byte[] J;
    public final DatagramPacket K;
    public Uri L;
    public DatagramSocket M;
    public MulticastSocket N;
    public InetAddress O;
    public boolean P;
    public int Q;

    public bdi() {
        super(true);
        this.I = 8000;
        byte[] bArr = new byte[2000];
        this.J = bArr;
        this.K = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // defpackage.tg5
    public final long b(ug5 ug5Var) throws UdpDataSource$UdpDataSourceException {
        Uri uri = ug5Var.a;
        this.L = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.L.getPort();
        q();
        try {
            this.O = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.O, port);
            if (this.O.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.N = multicastSocket;
                multicastSocket.joinGroup(this.O);
                this.M = this.N;
            } else {
                this.M = new DatagramSocket(inetSocketAddress);
            }
            this.M.setSoTimeout(this.I);
            this.P = true;
            r(ug5Var);
            return -1L;
        } catch (IOException e) {
            throw new UdpDataSource$UdpDataSourceException(2001, e);
        } catch (SecurityException e2) {
            throw new UdpDataSource$UdpDataSourceException(2006, e2);
        }
    }

    @Override // defpackage.tg5
    public final void close() {
        this.L = null;
        MulticastSocket multicastSocket = this.N;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.O;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.N = null;
        }
        DatagramSocket datagramSocket = this.M;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.M = null;
        }
        this.O = null;
        this.Q = 0;
        if (this.P) {
            this.P = false;
            n();
        }
    }

    @Override // defpackage.tg5
    public final Uri m() {
        return this.L;
    }

    @Override // defpackage.og5
    public final int read(byte[] bArr, int i, int i2) throws UdpDataSource$UdpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.Q;
        DatagramPacket datagramPacket = this.K;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.M;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.Q = length;
                j(length);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSource$UdpDataSourceException(2002, e);
            } catch (IOException e2) {
                throw new UdpDataSource$UdpDataSourceException(2001, e2);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.Q;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.J, length2 - i4, bArr, i, iMin);
        this.Q -= iMin;
        return iMin;
    }
}
