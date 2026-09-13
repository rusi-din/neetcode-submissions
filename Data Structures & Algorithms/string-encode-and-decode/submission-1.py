class Solution:
    def encode(self, strs: List[str]) -> str:
        output = ""
        for i in strs:
            output = output + i + "0;0"
        return output

    def decode(self, s: str) -> List[str]:
        if len(s) == 1 and s[0] == "0;0":
            return [""]
        output=s.split("0;0")
        output.pop(len(output)-1)
        return output
