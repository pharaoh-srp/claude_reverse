    oKr.fromArrayBufferToHex = SFd;
    function SFd(e) {
      return Array.from(new Uint8Array(e)).map(n => n.toString(16).padStart(2, "0")).join("");
    }
  });